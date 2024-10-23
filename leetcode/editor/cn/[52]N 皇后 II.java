//n 皇后问题 研究的是如何将 n 个皇后放置在 n × n 的棋盘上，并且使皇后彼此之间不能相互攻击。 
//
// 给你一个整数 n ，返回 n 皇后问题 不同的解决方案的数量。 
//
// 
//
// 
// 
// 示例 1： 
// 
// 
//输入：n = 4
//输出：2
//解释：如上图所示，4 皇后问题存在两个不同的解法。
// 
// 
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 9 
// 
//
// Related Topics 回溯 👍 519 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int result = 0;

    public int totalNQueens(int n) {
        int[] queens = new int[n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonal1 = new HashSet<>();
        Set<Integer> diagonal2 = new HashSet<>();
        nQueens(n,0,queens,cols,diagonal1,diagonal2);
        return result;
    }

    private void nQueens(int n,int row,int[] queens,Set<Integer> cols ,Set<Integer> diagonal1,Set<Integer> diagonal2){
        if (row == n) {
            result++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (cols.contains(i)){
                continue;
            }
            if(diagonal1.contains(i - row)) {
                continue;
            }
            if(diagonal2.contains(i + row)) {
                continue;
            }
            queens[row] = i;
            cols.add(i);
            diagonal1.add(i-row);
            diagonal2.add(i+row);
            nQueens(n,row+1,queens,cols,diagonal1,diagonal2);
            cols.remove(i);
            diagonal1.remove(i-row);
            diagonal2.remove(i+row);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
