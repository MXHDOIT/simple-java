package jdk;

/**
 * @author MaXinHang.
 */
public class StringBufferTest {
    /**
     * StringBuffer是线程安全的但效率低
     * 线程安全通过synchronized实现
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //默认容量 16
        //方法实现都是调用父类方法，只是多了synchronized保证线程安全
    }
}
