package task.timingwheel;

/**
 * 任务.
 */
public class TimerTaskEntry {
    /**
     * 延迟时间.
     */
    private long delayMs;
    /**
     * 任务.
     */
    private Runnable task;
    /**
     * 描述
     */
    private  String desc;
    /**
     * 下一个节点.
     */
    private TimerTaskEntry next;
    /**
     * 上一个节点.
     */
    private TimerTaskEntry pre;

    public TimerTaskEntry(long delayMs,Runnable task) {
        this.delayMs = delayMs;
        this.task = task;
    }

    public Runnable getTask() {
        return this.task;
    }

    public long getDelayMs() {
        return this.delayMs;
    }

    @Override
    public String toString() {
        return desc;
    }
}
