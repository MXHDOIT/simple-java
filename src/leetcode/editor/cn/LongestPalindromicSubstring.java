package leetcode.editor.cn;

//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
// Related Topics 字符串 动态规划 
// 👍 6118 👎 0

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        String cbbd = solution.longestPalindrome("cbbd");
        System.out.println(cbbd);
        String babad = solution.longestPalindrome("babad");
        System.out.println(babad);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            //中心扩散发
            String max = "";
            for (int i = 0; i < s.length(); i++) {
                String str = findalindromic(s, i);
                if (str.length() > max.length()) {
                    max = str;
                }
            }
            return max;
        }

        private String findalindromic(String s, int i) {
            int left = i - 1;
            int right = i + 1;
            char c = s.charAt(i);
            while (right < s.length() && c == s.charAt(right)) {
                right++;
            }
            while (left >= 0 && c == s.charAt(left)) {
                left--;
            }

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return s.substring(left + 1, right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}