package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 11:22.
 */
public class HeadSort implements Sort {
    @Override
    public void sort(int[] arr) {
        buildHead(arr);

        for (int i = arr.length-1; i > 0; i--) {
            swap(arr,i,0);
            shiftDown(arr, i, 0);
        }
    }

    public void buildHead(int[] arr) {
        int length = arr.length;
        int lastParent = (length - 2) / 2;
        for (int i = lastParent; i >= 0; i--) {
            shiftDown(arr, length, i);
        }
    }

    public void shiftDown(int[] arr, int size, int index) {
        int left = index * 2 + 1;
        if (left < size) {
            int maxValueIndex = index;
            if (arr[maxValueIndex] < arr[left]) {
                maxValueIndex = left;
            }

            int right = left + 1;
            if (right < size && arr[maxValueIndex] < arr[right]) {
                maxValueIndex = right;
            }
            if (index != maxValueIndex) {
                swap(arr, index, maxValueIndex);
                shiftDown(arr, size, maxValueIndex);
            }
        }
    }

    private void swap(int[] arr, int inex1, int index2) {
        int temp = arr[inex1];
        arr[inex1] = arr[index2];
        arr[index2] = temp;
    }
}
