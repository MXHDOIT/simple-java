package task;

/**
 * 周期性任务.
 *
 * @author mxh.
 * @version 2023/3/1 16:40
 */
public class ScheduleTask extends Thread {

    /**
     * 周期时间，单位ms.
     */
    private long period;

    /**
     * 任务.
     */
    private Runnable runnable;

    public ScheduleTask(long millis, Runnable runnable) {
        this.period = millis;
        this.runnable = runnable;
    }

    @Override
    public void run() {
        while (true) {
            try {
                runnable.run();
                Thread.sleep(period);
            } catch (InterruptedException ignore) {
            }
        }

    }
}
