package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 11:22.
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapFlag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j+1] < arr[j]) {
                    swap(arr,j+1,j);
                    swapFlag = true;
                }
            }
            if (!swapFlag){
                break;
            }
        }
    }

    private void swap(int[] arr,int inex1,int index2) {
        int temp = arr[inex1];
        arr[inex1] = arr[index2];
        arr[index2] = temp;
    }
}
