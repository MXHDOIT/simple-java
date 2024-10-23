//给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。 
//
// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。 
//
// 
//
// 示例 1： 
// 
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCCED"
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"SEE"
//输出：true
// 
//
// 示例 3： 
// 
// 
//输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = 
//"ABCB"
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
// 
//
// 进阶：你可以使用搜索剪枝的技术来优化解决方案，使其在 board 更大的情况下可以更快解决问题？ 
//
// Related Topics 数组 字符串 回溯 矩阵 👍 1845 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(isExist(board, word, 0, visited, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isExist(char[][] board, String word, int index, boolean[][] visited, int column, int row) {
        if (index == word.length()) {
            return true;
        }
        if (column < 0 || column >= board.length || row < 0 || row >= board[0].length || visited[column][row]) {
            return false;
        }
        visited[column][row] = true;
        boolean isExist = word.charAt(index) == board[column][row]
                && (isExist(board, word, index + 1, visited, column, row - 1)
                || isExist(board, word, index + 1, visited, column, row + 1)
                || isExist(board, word, index + 1, visited, column - 1, row)
                || isExist(board, word, index + 1, visited, column + 1, row));
        visited[column][row] = false;
        return isExist;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
