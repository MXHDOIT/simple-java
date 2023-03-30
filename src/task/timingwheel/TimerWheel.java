package task.timingwheel;

import java.util.TimerTask;
import java.util.concurrent.DelayQueue;

/**
 * 时间轮.
 */
public class TimerWheel {
    /**
     * 时间格的时间跨度.
     */
    private long tickMs;
    /**
     * 时间格个数.
     */
    private int wheelSize;
    /**
     * 时间轮的时间跨度.
     */
    private long interval;
    /**
     * 时间格.
     */
    private TimerTaskList[] timerTaskLists;
    /**
     * 当前时间.
     */
    private long currentTime;
    /**
     * 上层时间轮.
     */
    private volatile TimerWheel overflowWheel;
    /**
     * 一个Timer只有一个delayQueue????
     */
    private DelayQueue<TimerTaskList> delayQueue;

    public TimerWheel(long tickMs, int wheelSize, long currentTime, DelayQueue<TimerTaskList> delayQueue) {
        this.currentTime = currentTime;
        this.tickMs = tickMs;
        this.wheelSize = wheelSize;
        this.interval = tickMs * wheelSize;
        this.timerTaskLists = new TimerTaskList[wheelSize];
        //currentTime为tickMs的整数倍 这里做取整操作
        this.currentTime = currentTime - (currentTime % tickMs);
        this.delayQueue = delayQueue;
        for (int i = 0; i < wheelSize; i++) {
            timerTaskLists[i] = new TimerTaskList();
        }
    }

    /**
     * 获取/创建上一层时间轮.
     */
    public TimerWheel getOverflowWheel() {
        if (overflowWheel == null) {
            synchronized (this) {
                if (overflowWheel == null) {
                    overflowWheel = new TimerWheel(interval, wheelSize, currentTime, delayQueue);
                }
            }
        }
        return overflowWheel;
    }

    public boolean addTask(TimerTaskEntry timerTaskEntry) {
        long expiration = timerTaskEntry.getDelayMs();
        return true;
    }
}
