package algorithm.sort.impl;

/**
 * @author: maxinhang.
 * @version: 2024/2/23 19:29.
 */
public class TopKByQuickSort {

    public static void main(String[] args) {
        int i = new TopKByQuickSort().topK(new int[]{2, 6, 3, 5, 9, 0}, 5);
        System.out.println(i);
    }
    public int topK(int[] nums, int k) {
        if (k > nums.length) {
            throw new RuntimeException("K gt num length");
        }
        int index = partition(nums, 0, nums.length - 1);
        while (index + 1 != k) {
            if (index + 1 > k) {
                index = partition(nums, 0, index - 1);
            } else {
                index = partition(nums, index + 1, nums.length - 1);
            }
        }
        return nums[index];
    }

    private int partition(int[] nums, int left, int right) {
        int num = nums[right];

        while (left < right) {
            while (nums[left] > num && left < right) {
                left++;
            }
            if (left < right) {
                swap(nums, left, right);
                right--;
            }
            while (nums[right] < num && left < right) {
                right--;
            }
            if (left < right) {
                swap(nums, left, right);
                left++;
            }
        }
        nums[right] = num;
        return right;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
