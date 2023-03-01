package task;

/**
 * 定时任务.
 *
 * @author mxh.
 * @version 2023/3/1 16:23
 */
public class DelayTask extends Thread {

    /**
     * 延迟时间.
     */
    private long delayTime;

    /**
     * 任务.
     */
    private Runnable runnable;

    public DelayTask(long millis, Runnable runnable) {
        this.delayTime = millis;
        this.runnable = runnable;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(delayTime);
            runnable.run();
        } catch (InterruptedException ignore) {

        }
    }
}
