//给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。 
//
// 请你找到并返回这个整数 
//
// 
//
// 示例： 
//
// 
//输入：arr = [1,2,2,6,6,6,6,7,10]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5 
// 
//
// Related Topics 数组 👍 113 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findSpecialInteger(int[] arr) {
        int m = arr.length / 4;
        for (int i : new int[]{m, m * 2 + 1}) {
            int x = arr[i];
            int j = lowerBound(arr, x);
            if (arr[j + m] == x) {
                return x;
            }
        }
        return arr[m * 3 + 2];
    }

    private int lowerBound(int[] arr, int x) {
        int left = -1;
        int right = arr.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
