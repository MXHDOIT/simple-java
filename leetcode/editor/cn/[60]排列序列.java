//给出集合 [1,2,3,...,n]，其所有元素共有 n! 种排列。 
//
// 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下： 
//
// 
// "123" 
// "132" 
// "213" 
// "231" 
// "312" 
// "321" 
// 
//
// 给定 n 和 k，返回第 k 个排列。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3, k = 3
//输出："213"
// 
//
// 示例 2： 
//
// 
//输入：n = 4, k = 9
//输出："2314"
// 
//
// 示例 3： 
//
// 
//输入：n = 3, k = 1
//输出："123"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 1 <= k <= n! 
// 
//
// Related Topics 递归 数学 👍 854 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        boolean[] visited = new boolean[n];
        List<String> list = new ArrayList<>();
        permutation(nums, visited, list, n, k, new StringBuilder());
        return list.get(k - 1);
    }

    private void permutation(int[] nums, boolean[] visited, List<String> list, int n, int k,
                             StringBuilder stringBuilder) {
        if (list.size() == k) {
            return;
        }
        if (stringBuilder.length() == n) {
            list.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                stringBuilder.append(nums[i]);
                permutation(nums, visited, list, n, k, stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                visited[i] = false;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
