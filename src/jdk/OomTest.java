package jdk;

import java.util.ArrayList;

/**
 * @author MaXinHang.
 */
public class OomTest {

    public static void main(String[] args) {
//        heapOom();
//        stackOom();
        runtimeConstantPoolOom();
    }

    //1.堆内存 -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    private static void heapOom() {
        ArrayList<OomObject> oomObjects = new ArrayList<>();

        while (true) {
            oomObjects.add(new OomObject());
        }
    }

    private static int stackLength = 1;

    private static void stackLeak() {
        stackLength++;
        stackLeak();
    }

    //2.栈溢出
    private static void stackOom() {
        stackLeak();
    }

    //3.运行时常量池 -XX:PermSize=10M -XX:MaxPermSize=10M
    private static void runtimeConstantPoolOom() {
        ArrayList<String> strings = new ArrayList<>();
        int i = 1;
        while (true) {
            strings.add(String.valueOf(i++).intern());
        }
    }

    //4.方法区 -XX:PermSize=10M -XX:MaxPermSize=10M
    private static void javaMethodAreaOom() {
        while (true){}
    }

    static class OomObject {

    }
}
