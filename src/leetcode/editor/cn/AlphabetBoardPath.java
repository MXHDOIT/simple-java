package leetcode.editor.cn;

//我们从一块字母板上的位置 (0, 0) 出发，该坐标对应的字符为 board[0][0]。 
//
// 在本题里，字母板为board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"]，如下所示。 
//
// 
//
// 我们可以按下面的指令规则行动： 
//
// 
// 如果方格存在，'U' 意味着将我们的位置上移一行； 
// 如果方格存在，'D' 意味着将我们的位置下移一行； 
// 如果方格存在，'L' 意味着将我们的位置左移一列； 
// 如果方格存在，'R' 意味着将我们的位置右移一列； 
// '!' 会把在我们当前位置 (r, c) 的字符 board[r][c] 添加到答案中。 
// 
//
// （注意，字母板上只存在有字母的位置。） 
//
// 返回指令序列，用最小的行动次数让答案和目标 target 相同。你可以返回任何达成目标的路径。 
//
// 
//
// 示例 1： 
//
// 
//输入：target = "leet"
//输出："DDR!UURRR!!DDD!"
// 
//
// 示例 2： 
//
// 
//输入：target = "code"
//输出："RR!DDRR!UUL!R!"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= target.length <= 100 
// target 仅含有小写英文字母。 
// 
// Related Topics 哈希表 字符串 
// 👍 90 👎 0

public class AlphabetBoardPath{
    public static void main(String[] args) {
        Solution solution = new AlphabetBoardPath().new Solution();
        String leet = solution.alphabetBoardPath("leet");
        System.out.println(leet);
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String alphabetBoardPath(String target) {
        //当前横坐标
        int x = 0;
        //当前纵坐标
        int y = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            //下一个点的横坐标
            int col = (c - 'a') / 5;
            //下一个点的纵坐标
            int row = (c - 'a') % 5;

            //先上移再左移
            if(col < x){
                for (int i1 = 0; i1 < x - col; i1++) {
                    sb.append("U");
                }
            }
            if(row < y) {
                for (int i1 = 0; i1 < y - row; i1++) {
                    sb.append("L");
                }
            }
            if (row >= y) {
                for (int i1 = 0; i1 < row - y; i1++) {
                    sb.append("R");
                }
            }
            if (col >= x) {
                for (int i1 = 0; i1 < col - x; i1++) {
                    sb.append("D");
                }
            }

            sb.append("!");
            x = col;
            y = row;
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}