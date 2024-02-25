package algorithm.query;

/**
 * @author: maxinhang.
 * @version: 2024/2/25 22:21.
 */
public class SqrtExample {
    public static void main(String[] args) {
        double v = squareRoot(0.09, 0.000001);

        System.out.println(v);
    }

    public static double squareRoot(double a, double precision) {
        double high, low;
        if (a >= 1) {
            high = a;
            low = 1;
        } else {
            high = 1;
            low = a;
        }

        while (low <= high) {
            double mid = (low + high) / 2.000000;
            if (mid * mid - a <= precision && mid * mid - a >= precision * -1) {
                return mid;
            } else if (mid * mid > a) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return -1.000000;
    }
}
