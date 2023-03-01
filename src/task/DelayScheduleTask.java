package task;

/**
 * 延迟的周期任务.
 *
 * @author mxh.
 * @version 2023/3/1 16:50
 */
public class DelayScheduleTask extends Thread {
    /**
     * 延迟时间.
     */
    private long delayTime;

    /**
     * 周期时间，单位ms.
     */
    private long period;

    /**
     * 任务.
     */
    private Runnable runnable;

    public DelayScheduleTask(long delayTime,long period,Runnable runnable) {
        this.delayTime = delayTime;
        this.period = period;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        try {
            //先延迟
            Thread.sleep(delayTime);
        } catch (InterruptedException ignore) {

        }
        while (true) {
            try {
                runnable.run();
                Thread.sleep(period);
            } catch (InterruptedException ignore) {
            }
        }

    }
}
