//给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics 数组 矩阵 模拟 👍 1768 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        List<Integer> result = new ArrayList<>();

        while (left <= right && up <= down) {
            for (int temp = left; temp <= right; temp++) {
                result.add(matrix[up][temp]);
            }
            up++;
            for (int temp = up; temp <= down; temp++) {
                result.add(matrix[temp][right]);
            }
            right--;
            if (up <= down) {
                for (int temp = right; temp >= left; temp--) {
                    result.add(matrix[down][temp]);
                }
            }
            down--;
            if (left <= right) {
                for (int temp = down; temp >= up; temp--) {
                    result.add(matrix[temp][left]);
                }
            }
            left++;
        }
        return result;
    }}
//leetcode submit region end(Prohibit modification and deletion)
