package algorithm.sort.impl;

import algorithm.sort.Sort;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 10:31.
 */
public class InsertSort implements Sort {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //有序区间[0,i)
            //无序区间[i,array.length)
            int num = arr[i]; //无序区间第一个数
            int end = i - 1; //比较的元素位置
            while (end >= 0 && num < arr[end]) { //当数组不越界同时当前数比相比较的数小的时候
                arr[end + 1] = arr[end];//移位
                end--;
            }
            //插入元素
            arr[end + 1] = num;
        }
    }
}
