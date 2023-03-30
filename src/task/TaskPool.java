package task;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author mxh.
 * @version 2023/3/2 10:36
 */
public class TaskPool {
    //延迟队列存储任务.
    DelayQueue<OptDelayScheduleTask> priorityQueue = new DelayQueue<>();
    //可缓存的线程池，若线程数超过处理所需，缓存一段时间后会回收，若线程数不够，则新建线程。
    ExecutorService threadPool = Executors.newCachedThreadPool();

    public TaskPool() {
        //启动线程去执行任务
        Runnable runnable = () -> {
            while (true) {
                try {
                    loopExecute();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(runnable).start();
    }

    /**
     * 执行任务.
     * @throws InterruptedException
     */
    private void loopExecute() throws InterruptedException {
        OptDelayScheduleTask minTask = priorityQueue.take();
        threadPool.submit(minTask.getRunnable());
        if (minTask.getPried() != 0) {
            long newExecuteTime = minTask.getPried() + System.currentTimeMillis();
            minTask.setNextExecuteTime(newExecuteTime);
            priorityQueue.add(minTask);
        }
    }

    /**
     * 提交任务.
     * @param task
     */
    public void submit(Runnable task,long delayTime,long pried) {
        priorityQueue.offer(new OptDelayScheduleTask(delayTime,pried,task));
    }

    /**
     * 任务.
     */
    static class OptDelayScheduleTask implements Delayed {
        /**
         * 延迟时间.
         */
        private long delayTime;

        /**
         * 周期时间.
         */
        private long pried;

        private long nextExecuteTime;

        private Runnable runnable;

        public OptDelayScheduleTask(long delayTime, long pried, Runnable runnable) {
            this.delayTime = delayTime;
            this.pried = pried;
            this.runnable = runnable;
            this.nextExecuteTime = System.currentTimeMillis() + delayTime;
        }

        public long getDelayTime() {
            return delayTime;
        }

        public long getPried() {
            return pried;
        }

        public long getNextExecuteTime() {
            return nextExecuteTime;
        }

        public void setNextExecuteTime(long nextExecuteTime) {
            this.nextExecuteTime = nextExecuteTime;
        }

        public Runnable getRunnable() {
            return runnable;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(nextExecuteTime - System.currentTimeMillis(),TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }
    }
}
