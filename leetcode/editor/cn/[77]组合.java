//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1683 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> result = new ArrayList<>();
        combine(nums, new ArrayList<>(), result, k, 0);
        return result;
    }

    public void combine(int[] nums, List<Integer> temp, List<List<Integer>> result, int k, int index) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < nums.length; i++) {
                temp.add(nums[i]);
                combine(nums, temp, result, k, i+1);
                temp.remove(temp.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
