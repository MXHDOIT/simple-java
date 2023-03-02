package task;

/**
 * @author mxh.
 * @version 2023/3/1 16:32
 */
public class Test {
    public static void main(String[] args) {
        testTaskPool();
    }


    public static void testTaskPool() {
        long begin = System.currentTimeMillis();

        TaskPool taskPool = new TaskPool();
        OptDelayScheduleTask optDelayScheduleTask = new OptDelayScheduleTask(1000, 2000, () -> {
            System.out.println("任务1：time:" + (System.currentTimeMillis()-begin));
        });
        OptDelayScheduleTask optDelayScheduleTask2 = new OptDelayScheduleTask(2000, 4000, () -> {
            System.out.println("任务2：time:" +  (System.currentTimeMillis()-begin));
        });
        taskPool.submit(optDelayScheduleTask);
        taskPool.submit(optDelayScheduleTask2);
    }
}
