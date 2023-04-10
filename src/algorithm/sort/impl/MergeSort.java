package algorithm.sort.impl;

import algorithm.sort.Sort;

import java.util.Arrays;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 11:23.
 */
public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        mergeSort(arr, left, mid, right);
    }

    private void mergeSort(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int lIndex = left;
        int rIndex = mid + 1;
        int index = 0;
        while (lIndex <= mid && rIndex <= right) {
            if (arr[lIndex] < arr[rIndex]) {
                temp[index] = arr[lIndex];
                lIndex++;
            } else {
                temp[index] = arr[rIndex];
                rIndex++;
            }
            index++;
        }

        while (lIndex <= mid) {
            temp[index++] = arr[lIndex++];
        }

        while (rIndex <= right) {
            temp[index++] = arr[rIndex++];
        }
        index = 0;
        for (int i = left; i <= right; i++) {
            arr[i] = temp[index++];
        }
    }
}
