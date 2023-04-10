package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 11:10.
 */
public class SelectPlusSort implements Sort {
    @Override
    public void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left + 1; i <= right; i++) {
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                }
                if (arr[maxIndex] < arr[i]) {
                    maxIndex = i;
                }
            }
            swap(arr,minIndex,left);
            if (left == maxIndex) {
                maxIndex = minIndex;
            }
            swap(arr,maxIndex,right);
            left++;
            right--;
        }
    }

    private void swap(int[] arr,int inex1,int index2) {
        int temp = arr[inex1];
        arr[inex1] = arr[index2];
        arr[index2] = temp;
    }
}
