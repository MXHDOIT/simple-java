package leetcode.editor.cn;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 矩阵 模拟 
// 👍 489 👎 0

public class ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix == null){
                return new int[0];
            }
            int high = matrix.length;
            if (high == 0){
                return new int[0];
            }
            int width = matrix[0].length;
            int[] result = new int[high * width];
            int index = 0;
            int left = 0;
            int right = width - 1;
            int up = 0;
            int down = high - 1;
            while (left <= right && up <= down) {
                for (int i = left;i <= right;i++){
                    result[index++] = matrix[up][i];
                }
                up++;
                if (up > down){
                    break;
                }
                for (int i = up;i <= down;i++){
                    result[index++] = matrix[i][right];
                }
                right--;
                if (left > right){
                    break;
                }
                for (int i = right; i >= left ; i--) {
                    result[index++] = matrix[down][i];
                }
                down--;
                if (up > down){
                    break;
                }
                for (int i = down; i >= up ; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}