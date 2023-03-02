package task;

/**
 * @author mxh.
 * @version 2023/3/2 10:31
 */
public class OptDelayScheduleTask {
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
}