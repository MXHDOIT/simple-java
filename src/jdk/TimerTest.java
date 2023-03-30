package jdk;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时任务.
 */
public class TimerTest {
    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("current task1 "+Thread.currentThread().getName()+" current time:"+System.currentTimeMillis());
            }
        },1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("current task2 "+Thread.currentThread().getName()+" current time:"+System.currentTimeMillis());
            }
        },1002);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("current task2 "+Thread.currentThread().getName()+" current time:"+System.currentTimeMillis());
            }
        },1002,1000);

        System.in.read();
    }
}
