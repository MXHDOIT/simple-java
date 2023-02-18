package jdk;

import java.util.AbstractList;

/**
 * @author MaXinHang.
 */
public class AbstractListTest {
    public static void main(String[] args) {
        AbstractList<Object> objects = new AbstractList<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public Object get(int index) {
                return null;
            }
        };

    }
}
