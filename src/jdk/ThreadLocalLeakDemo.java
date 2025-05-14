package jdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: maxinhang.
 */
public class ThreadLocalLeakDemo {
    private static ThreadLocal<List<Integer>> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(() -> {
            threadLocal.set(new ArrayList<>(Arrays.asList(1, 2, 3)));
            System.out.println("Value set.");
        }).get();

        // 模拟移除强引用
//        threadLocal = null;
        System.gc(); // 触发 GC，弱引用键被回收

        pool.submit(() -> {
            // 尝试获取旧值
            List<Integer> value = threadLocal.get(); // 此处 threadLocal 为 null，NPE
            System.out.println("Value: " + value);
        }).get();

        pool.shutdown();
    }
}
