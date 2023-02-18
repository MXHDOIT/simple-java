package jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author MaXinHang.
 */
public class ListTests {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt());
        }

        list.sort(null);
    }
}
