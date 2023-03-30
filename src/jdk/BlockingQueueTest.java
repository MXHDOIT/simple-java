package jdk;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);

        BlockingQueue blockingQueue1 = new DelayQueue();

    }
}
/**
 * 阻塞队列：在队列为空时，获取元素的线程会等待线程变为非空。当队列满时，存储元素的元素会等待队列可用。
 * BlockQueue是一个接口，它的实现类：
 * ArrayBlockingQueue:
 * DelayQueue:
 * LinkedBlockingQueue:
 * LinkedBlockingDeque:
 * PriorityBlockingQueue:
 * SynchronousQueue:
 */