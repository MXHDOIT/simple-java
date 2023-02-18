package jdk;

import java.util.HashMap;

/**
 * @author MaXinHang.
 */
public class HashMapTest {
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * 负载因子：默认0.75
     */
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        int sizeFor = tableSizeFor(9);
        objectObjectHashMap.put(1,1);
        objectObjectHashMap.keySet();
        objectObjectHashMap.values();
        System.out.println(sizeFor);
    }

    //大于或等于cap，最小的2的n次幂
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
