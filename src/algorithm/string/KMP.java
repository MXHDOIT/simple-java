package algorithm.string;

/**
 * @author: maxinhang.
 * @version: 2024/3/1 10:08.
 */
public class KMP {

    private int[] getNext(char[] b, int m) {
        int[] next = new int[m];
        next[0] = -1;
        int k = -1;
        for (int i = 1; i < m; i++) {
            while (k != -1 && b[k + 1] != b[i]) {
                k = next[k];
            }

            if (b[k + 1] == b[i]) {
                ++k;
            }

            next[i] = k;
        }
        return next;
    }

    private int kmp(char[] a, int n, char[] b, int m) {
        int[] next = getNext(b, m);
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j > 0 && a[i] != b[j]) {
                j = next[j - 1] + 1;
            }
            if (a[i] == b[j]) {
                ++j;
            }
            if (j == m) {
                return i - m + 1;
            }
        }

        return -1;
    }
}
