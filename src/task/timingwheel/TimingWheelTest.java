package task.timingwheel;

import java.util.concurrent.CountDownLatch;

/**
 * @author: maxinhang.
 * @version: 2023/4/3 10:11.
 */
public class TimingWheelTest {

    static int inCount = 0;

    static int runCount = 0;
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        Timer timer = new Timer();
        for(int i=1;i<=1000;i++){
            TimerTask timerTask = new TimerTask(i,()->{
                countDownLatch.countDown();
                int index = addRun();
                System.out.println(index+"----------执行");
            });
            timer.addTask(timerTask);
            System.out.println(i+"++++++++++加入");
            inCount++;
        }
        TimerTask timerTask = new TimerTask(5000,()->{
            countDownLatch.countDown();
            int index = addRun();
            System.out.println(index+"----------执行");
        });
        timer.addTask(timerTask);
        try {
            countDownLatch.await();
            System.out.println("inCount" + inCount);
            System.out.println("runCount" + runCount);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized static int addRun(){
        runCount++;
        return runCount;
    }
}
