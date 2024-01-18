package exercise;

import java.util.Arrays;

/**
 * @author: maxinhang.
 * @version: 2023/4/6 20:51.
 */
public class Test {
    public static void main(String[] args) {
        myAtoi("-000000000000001");
    }

    public static int myAtoi(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int index = 0;
        boolean minus = false;
        if (s.charAt(index) == '+') {
            index++;
        } else if (s.charAt(index) == '-') {
            index++;
            minus = true;
        }
        int result = 0;
        for (; index < s.length(); index++) {
            char c = s.charAt(index);
            if (c >= '0' && c <= '9') {
                int num = c - '0';
                if (result > (Integer.MAX_VALUE - num) / 10) {
                    return minus?Integer.MIN_VALUE:Integer.MAX_VALUE;
                } else {
                    result = result * 10 + num;
                }
            } else {
                break;
            }
        }
        return minus ? -result : result;
    }
}
