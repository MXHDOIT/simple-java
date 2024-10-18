package exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentStringGenerator {

    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int STRING_LENGTH = 16;
    private static final int TOTAL_STRINGS = 20_000_000;
    private static final int THREAD_COUNT = 10; // 线程数量，可以根据CPU核心数调整
    private static final String OUTPUT_FILE = "strings.txt";
    private static final Lock fileLock = new ReentrantLock();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            int stringsPerThread = TOTAL_STRINGS / THREAD_COUNT;
            for (int i = 0; i < THREAD_COUNT; i++) {
                executorService.submit(() -> generateStrings(stringsPerThread, writer));
            }

            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            System.out.println("String generation complete.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void generateStrings(int count, BufferedWriter writer) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder(STRING_LENGTH);
            for (int j = 0; j < STRING_LENGTH; j++) {
                sb.append(CHAR_SET.charAt(random.nextInt(CHAR_SET.length())));
            }
            String generatedString = sb.toString();

            // 使用锁来确保线程安全地写入文件
            fileLock.lock();
            try {
                writer.write(generatedString);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileLock.unlock();
            }
        }
    }
}
