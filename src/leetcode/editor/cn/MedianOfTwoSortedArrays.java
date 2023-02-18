package leetcode.editor.cn;

//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics 数组 二分查找 分治 
// 👍 6241 👎 0

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        int[] a = {1, 2};
        int[] b = {3, 4};
        solution.findMedianSortedArrays(a, b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length = nums1.length + nums2.length;
            List<Integer> index = new ArrayList<>();
            if (length % 2 == 0) {
                int i = length / 2;
                index.add(i);
                index.add(i + 1);
            } else {
                int i = (length + 1) / 2;
                index.add(i);
            }

            int index1 = 0;
            int index2 = 0;
            int count = 0;
            int result = 0;
            while (index1 < nums1.length || index2 < nums2.length) {

                int num = 0;
                if (index1 >= nums1.length) {
                    num = nums2[index2];
                    index2++;
                } else if (index2 >= nums2.length) {
                    num = nums1[index1];
                    index1++;
                } else if(nums1[index1] <= nums2[index2]) {
                    num = nums1[index1];
                    index1++;
                } else{
                    num = nums2[index2];
                    index2++;
                }
                count++;
                if (count == index.get(0)) {
                    result += num;
                }
                if (index.size() == 2 && count == index.get(1)) {
                    result += num;
                }
            }
            if (index.size() == 2) {
                return result * 1.0 / 2;
            } else {
                return result * 1.0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}