//给你一个由小写字母组成的字符串 s，和一个整数 k。 
//
// 请你按下面的要求分割字符串： 
//
// 
// 首先，你可以将 s 中的部分字符修改为其他的小写英文字母。 
// 接着，你需要把 s 分割成 k 个非空且不相交的子串，并且每个子串都是回文串。 
// 
//
// 请返回以这种方式分割字符串所需修改的最少字符数。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abc", k = 2
//输出：1
//解释：你可以把字符串分割成 "ab" 和 "c"，并修改 "ab" 中的 1 个字符，将它变成回文串。
// 
//
// 示例 2： 
//
// 输入：s = "aabbc", k = 3
//输出：0
//解释：你可以把字符串分割成 "aa"、"bb" 和 "c"，它们都是回文串。 
//
// 示例 3： 
//
// 输入：s = "leetcode", k = 8
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= s.length <= 100 
// s 中只含有小写英文字母。 
// 
//
// Related Topics 字符串 动态规划 👍 150 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int palindromePartition(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n][k];
        // 初始化 dp 数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        // 初始化边界条件
        for (int i = 0; i < n; i++) {
            dp[i][0] = getCost(s, 0, i);
        }
        // 动态规划过程
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < Math.min(k, i + 1); j++) {
                for (int l = j; l <= i; l++) {
                    dp[i][j] = Math.min(dp[i][j], dp[l - 1][j - 1] + getCost(s, l, i));
                }
            }
        }
        return dp[n - 1][k - 1];
    }

    private int getCost(String s, int start, int end) {
        int cost = 0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                cost++;
            }
            start++;
            end--;
        }
        return cost;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
