package leetcode.editor.cn;

//你还记得那条风靡全球的贪吃蛇吗？ 
//
// 我们在一个 n*n 的网格上构建了新的迷宫地图，蛇的长度为 2，也就是说它会占去两个单元格。蛇会从左上角（(0, 0) 和 (0, 1)）开始移动。我们用
// 0 表示空单元格，用 1 表示障碍物。蛇需要移动到迷宫的右下角（(n-1, n-2) 和 (n-1, n-1)）。 
//
// 每次移动，蛇可以这样走： 
//
// 
// 如果没有障碍，则向右移动一个单元格。并仍然保持身体的水平／竖直状态。 
// 如果没有障碍，则向下移动一个单元格。并仍然保持身体的水平／竖直状态。 
// 如果它处于水平状态并且其下面的两个单元都是空的，就顺时针旋转 90 度。蛇从（(r, c)、(r, c+1)）移动到 （(r, c)、(r+1, c)）。
// 
// 
// 如果它处于竖直状态并且其右面的两个单元都是空的，就逆时针旋转 90 度。蛇从（(r, c)、(r+1, c)）移动到（(r, c)、(r, c+1)）。 
//
// 
// 
//
// 返回蛇抵达目的地所需的最少移动次数。 
//
// 如果无法到达目的地，请返回 -1。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：grid = [[0,0,0,0,0,1],
//               [1,1,0,0,1,0],
//               [0,0,0,0,1,1],
//               [0,0,1,0,1,0],
//               [0,1,1,0,0,0],
//               [0,1,1,0,0,0]]
//输出：11
//解释：
//一种可能的解决方案是 [右, 右, 顺时针旋转, 右, 下, 下, 下, 下, 逆时针旋转, 右, 下]。
// 
//
// 示例 2： 
//
// 输入：grid = [[0,0,1,1,1,1],
//               [0,0,0,0,1,1],
//               [1,1,0,0,0,1],
//               [1,1,1,0,0,1],
//               [1,1,1,0,0,1],
//               [1,1,1,0,0,0]]
//输出：9
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 100 
// 0 <= grid[i][j] <= 1 
// 蛇保证从空单元格开始出发。 
// 
// Related Topics 广度优先搜索 数组 矩阵 
// 👍 108 👎 0

import java.util.ArrayDeque;
import java.util.Queue;

public class MinimumMovesToReachTargetWithRotations {
    public static void main(String[] args) {
        Solution solution = new MinimumMovesToReachTargetWithRotations().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //横坐标，纵坐标，状态
        private int[][] dirs = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        public int minimumMoves(int[][] grid) {
            int n = grid.length;
            boolean[][][] visits = new boolean[n][n][2];
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{0, 0, 0});

            int result = 0;
            if (!queue.isEmpty()) {
                Queue<int[]> temp = queue;
                queue = new ArrayDeque<>();
                for (int[] ints : temp) {
                    for (int[] dir : dirs) {
                        int nx = dir[0] + ints[0], ny = dir[1] + ints[1], nStatus = dir[2] ^ ints[0];
                        int headX = nx + nStatus, headY = ny + (nStatus ^ 1);
                        if (headX < n && headY < n && !visits[headX][headY][nStatus] &&
                                grid[nx][ny] == 0 && grid[headX][headY] == 0 && (dir[2] == 0 || grid[nx + 1][ny + 1] == 0)) {
                            if (nx == n-1 && ny == n-2) return result;
                            visits[nx][ny][nStatus] = true;
                            queue.add(new int[]{nx,ny,nStatus});
                        }
                    }
                }
                result++;
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}