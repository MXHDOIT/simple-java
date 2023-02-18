package jdk;

/**
 * @author MaXinHang.
 */
public class AbstractStringBuilderTest {
    private static Object AbstractStringBuilder;

    /**
     * 实现string可变
     */
    public static void main(String[] args) {
        //char数组保存字符串数据
        //count记录字符总数
        //数组扩容 ： *2+2，扩充后的容量还是不够，则直接扩充到需要的容量大小。+2是为了防止初始容量为0
        //append ：System.arraycopy 追加
        //insert ：System.arraycopy 移位
        //delete ：System.arraycopy 移位
        //reverse ：交换
        //getChars ：方法将字符从字符串复制到目标字符数组。
        //...
    }
}
