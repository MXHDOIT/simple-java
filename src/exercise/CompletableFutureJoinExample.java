package exercise;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class CompletableFutureJoinExample {
    public static void main(String[] args) {
        // 示例 1: 基本用法
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // 模拟耗时操作
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        });

        String result1 = future1.join(); // 阻塞等待结果
        System.out.println("Result 1: " + result1);

        // 示例 2: 处理异常
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Hello, World!";
        });

        try {
            String result2 = future2.join(); // 这里会抛出 CompletionException
            System.out.println("Result 2: " + result2);
        } catch (CompletionException e) {
            System.out.println("Caught exception: " + e.getCause().getMessage());
        }
    }
}

