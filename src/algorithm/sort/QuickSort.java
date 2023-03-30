package algorithm.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 10, 2};
        sort(arr);
        System.out.println(arr);
    }

    public static void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    public static void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int baseNum = nums[left];
        int l = left;
        int r = right;

        while (l < r) {
            while (nums[r] > baseNum && l < r) {
                r--;
            }
            if (l < r)
                nums[l++] = nums[r];
            while (nums[l] < baseNum && l < r) {
                l++;
            }
            if (l < r) {
                nums[r--] = nums[l];
            }
        }
        nums[l] = baseNum;
        sort(nums, left, l - 1);
        sort(nums, l + 1, right);
    }
}
