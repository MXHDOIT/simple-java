//编写一个程序，通过填充空格来解决数独问题。 
//
// 数独的解法需 遵循如下规则： 
//
// 
// 数字 1-9 在每一行只能出现一次。 
// 数字 1-9 在每一列只能出现一次。 
// 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图） 
// 
//
// 数独部分空格内已填入了数字，空白格用 '.' 表示。 
//
// 
//
// 
// 
// 
// 示例 1： 
// 
// 
//输入：board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".
//",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".
//","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6
//"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[
//".",".",".",".","8",".",".","7","9"]]
//输出：[["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8
//"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],[
//"4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9",
//"6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4",
//"5","2","8","6","1","7","9"]]
//解释：输入的数独如上图所示，唯一有效的解决方案如下所示：
// 
// 
// 
// 
//
//
//
// 
//
// 提示： 
//
// 
// board.length == 9 
// board[i].length == 9 
// board[i][j] 是一位数字或者 '.' 
// 题目数据 保证 输入数独仅有一个解 
// 
//
// Related Topics 数组 哈希表 回溯 矩阵 👍 1838 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean flag = false;
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        List<int[]> space = new ArrayList<int[]>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char ch = board[i][j];
                if (ch >= '1' && ch <= '9') {
                    int num = ch - '0' - 1;
                    rows[i][num] = true;
                    cols[j][num] = true;
                    blocks[i / 3 * 3 + j / 3][num] = true;
                } else {
                    space.add(new int[]{i, j});
                }
            }
        }

        dfs(board, rows, cols, blocks, space, 0);
    }

    private void dfs(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] blocks, List<int[]> space, int position) {
        if (position == space.size()) {
            flag = true;
            return;
        }

        int row = space.get(position)[0];
        int col = space.get(position)[1];
        for (int i = 0; i < 9; i++) {
            if (!flag && !rows[row][i] && !cols[col][i] && !blocks[row / 3 * 3 + col / 3][i]) {
                rows[row][i] = cols[col][i] = blocks[row / 3 * 3 + col / 3][i] = true;
                board[row][col] = (char) (i + 1 + '0');
                dfs(board, rows, cols, blocks, space, position + 1);
                rows[row][i] = cols[col][i] = blocks[row / 3 * 3 + col / 3][i] = false;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
