package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 11:01.
 */
public class SelectSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
