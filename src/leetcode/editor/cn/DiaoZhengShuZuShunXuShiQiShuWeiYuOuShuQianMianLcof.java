package leetcode.editor.cn;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 0 <= nums[i] <= 10000 
// 
// Related Topics 数组 双指针 排序 
// 👍 274 👎 0

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] exchange(int[] nums) {
            int l = 0;
            int r = nums.length - 1;

            while (l < r) {
                while (nums[l] % 2 == 1 && l < r) {
                    l++;
                }
                while (nums[r] % 2 == 0 && l < r) {
                    r--;
                }
                if (l < r){
                    int num = nums[r];
                    nums[r] = nums[l];
                    nums[l] = num;
                }
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}