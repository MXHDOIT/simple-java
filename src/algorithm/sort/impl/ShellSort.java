package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 10:52.
 */
public class ShellSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0 ; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int num = arr[i];
                int end = i - gap;
                while (end >= 0 && num < arr[end]) {
                    arr[end+gap] = arr[end];
                    end-=gap;
                }
                arr[end+gap] = num;
            }
        }
    }
}
