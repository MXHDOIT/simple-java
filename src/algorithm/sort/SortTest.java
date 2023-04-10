package algorithm.sort;

import algorithm.sort.impl.InsertSort;
import algorithm.sort.impl.QuickSort;
import algorithm.sort.impl.SelectPlusSort;
import algorithm.sort.impl.SelectSort;
import algorithm.sort.impl.ShellSort;

import java.util.Arrays;

/**
 * @author: maxinhang.
 * @version: 2023/4/10 10:33.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 10, 2};
        Sort sort = null;
        //快排
//        sort = new QuickSort();
        //插入排序
//        sort = new InsertSort();
        //shell排序
//        sort = new ShellSort();
        //选择排序
//        sort = new SelectSort();
        //双端选择排序
        sort = new SelectPlusSort();
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
