package task;

/**
 * @author mxh.
 * @version 2023/3/1 16:32
 */
public class Test {
    public static void main(String[] args) {
        testDelayScheduleTask();
    }

    public static void testDelayScheduleTask() {
        long beginTime = System.currentTimeMillis();
        System.out.println("begin time :" + System.currentTimeMillis());
        DelayScheduleTask timedTask = new DelayScheduleTask(2000, 1000,new Runnable() {
            @Override
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                System.out.println("执行这个操作 time :" + currentTimeMillis);
                System.out.println("时间差 time:" + (currentTimeMillis - beginTime) + "ms");
            }
        });
        timedTask.start();
    }
}
