package leetcode.editor.cn;

//给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "AB
//CCED"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = [["a","b"],["c","d"]], word = "abcd"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board 和 word 仅由大小写英文字母组成 
// 
//
// 注意：本题与主站 79 题相同：https://leetcode-cn.com/problems/word-search/ 
// Related Topics 数组 回溯 矩阵 
// 👍 720 👎 0

public class JuZhenZhongDeLuJingLcof {
    public static void main(String[] args) {
        Solution solution = new JuZhenZhongDeLuJingLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean exist(char[][] board, String word) {
            if (board == null || board.length == 0) {
                return false;
            }
            char[] words = word.toCharArray();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    boolean b = find(board, i, j, new boolean[board.length][board[i].length], words, 0);
                    if (b) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean find(char[][] board, int row, int col, boolean[][] is, char[] words, int index) {
            if (words.length == index) {
                return true;
            }
            if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
                return false;
            }
            if (is[row][col]) {
                return false;
            }
            char word = words[index];
            char board_word = board[row][col];
            if (board_word != word) {
                return false;
            } else {
                is[row][col] = true;
                boolean find = find(board, row, col + 1, is, words, index + 1) ||
                        find(board, row, col - 1, is, words, index + 1) ||
                        find(board, row + 1, col, is, words, index + 1) ||
                        find(board, row - 1, col, is, words, index + 1);
                is[row][col] = false;
                return find;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}