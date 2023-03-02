package task;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mxh.
 * @version 2023/3/2 10:36
 */
public class TaskPool {

    PriorityQueue<OptDelayScheduleTask> priorityQueue = new PriorityQueue<>(Comparator.comparing(OptDelayScheduleTask::getNextExecuteTime));
    //可缓存的线程池，若线程数超过处理所需，缓存一段时间后会回收，若线程数不够，则新建线程。
    ExecutorService threadPool = Executors.newCachedThreadPool();
    public TaskPool() {
        //启动线程去执行任务
        Runnable runnable = () -> {
            while (true) {
                if (!priorityQueue.isEmpty()) {
                    OptDelayScheduleTask minTask = priorityQueue.peek();
                    long nextExecuteTime = minTask.getNextExecuteTime();
                    if (nextExecuteTime > System.currentTimeMillis()) {
                        continue;
                    }
                    priorityQueue.poll();
                    threadPool.submit(minTask.getRunnable());
                    long newExecuteTime = minTask.getPried() + System.currentTimeMillis();
                    minTask.setNextExecuteTime(newExecuteTime);
                    priorityQueue.add(minTask);
                }
            }
        };
        new Thread(runnable).start();
    }
    public void submit(OptDelayScheduleTask task) {
        priorityQueue.add(task);
    }
}
