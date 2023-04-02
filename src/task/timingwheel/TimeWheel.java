package task.timingwheel;

import java.util.concurrent.DelayQueue;

public class TimeWheel {

    /**
     * 基本时间跨度
     */
    private long tickMs;
    /**
     * 时间单位个数
     */
    private int wheelSize;
    /**
     * 总体时间跨度
     */
    private long interval;
    /**
     * 当前所处时间
     */
    private long currentTime;
    /**
     * 定时任务列表
     */
    private TimerTaskList[] buckets;
    /**
     * 上层时间轮
     */
    private volatile TimeWheel overflowWheel;
    /**
     * 一个Timer只有一个DelayQueue,协助推进时间轮
     */
    private DelayQueue<TimerTaskList> delayQueue;


    public TimeWheel(long tickMs, int wheelSize, long currentTime, DelayQueue<TimerTaskList> delayQueue) {
        this.tickMs = tickMs;
        this.wheelSize = wheelSize;
        this.interval = tickMs * wheelSize;
        this.currentTime = currentTime;
        this.buckets = new TimerTaskList[wheelSize];
        this.currentTime = currentTime - (currentTime % tickMs);
        this.delayQueue = delayQueue;
        for (int i = 0; i < wheelSize; i++) {
            buckets[i] = new TimerTaskList();
        }
    }

    public long getTickMs() {
        return tickMs;
    }

    public void setTickMs(long tickMs) {
        this.tickMs = tickMs;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public TimerTaskList[] getBuckets() {
        return buckets;
    }

    public void setBuckets(TimerTaskList[] buckets) {
        this.buckets = buckets;
    }

    public void setOverflowWheel(TimeWheel overflowWheel) {
        this.overflowWheel = overflowWheel;
    }

    public DelayQueue<TimerTaskList> getDelayQueue() {
        return delayQueue;
    }

    public void setDelayQueue(DelayQueue<TimerTaskList> delayQueue) {
        this.delayQueue = delayQueue;
    }

    public boolean add(TimerTaskEntry entry) {
        long expiration = entry.getExpireMs();
        if (expiration < tickMs + currentTime) {
            // 定时任务到期
            return false;
        } else if (expiration < currentTime + interval) {
            // 扔进当前时间轮的某个槽里,只有时间大于某个槽,才会放进去
            long virtualId = (expiration / tickMs);
            int index = (int) (virtualId % wheelSize);
            TimerTaskList bucket = buckets[index];
            bucket.addTask(entry);
            // 设置bucket 过期时间
            if (bucket.setExpiration(virtualId * tickMs)) {
                // 设好过期时间的bucket需要入队
                delayQueue.offer(bucket);
                return true;
            }
        } else {
            // 当前轮不能满足,需要扔到上一轮
            TimeWheel timeWheel = getOverflowWheel();
            return timeWheel.add(entry);
        }
        return false;
    }

    private TimeWheel getOverflowWheel() {
        if (overflowWheel == null) {
            synchronized (this) {
                if (overflowWheel == null) {
                    overflowWheel = new TimeWheel(interval, wheelSize, currentTime, delayQueue);
                }
            }
        }
        return overflowWheel;
    }

    /**
     * 推进指针
     *
     * @param timestamp
     */
    public void advanceLock(long timestamp) {
        if (timestamp > currentTime + tickMs) {
            currentTime = timestamp - (timestamp % tickMs);
            if (overflowWheel != null) {
                this.getOverflowWheel().advanceLock(timestamp);
            }
        }
    }

}