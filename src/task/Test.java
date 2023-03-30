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

        taskPool.submit(() ->
                System.out.println("任务1：time:" + (System.currentTimeMillis() - begin)), 1000, 2000);

        taskPool.submit(() ->
                System.out.println("任务2：    time:" + (System.currentTimeMillis() - begin)), 1000, 2000);
    }
}
