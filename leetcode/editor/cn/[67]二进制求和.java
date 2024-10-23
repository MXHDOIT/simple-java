//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。 
//
// 
//
// 示例 1： 
//
// 
//输入:a = "11", b = "1"
//输出："100" 
//
// 示例 2： 
//
// 
//输入：a = "1010", b = "1011"
//输出："10101" 
//
// 
//
// 提示： 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a 和 b 仅由字符 '0' 或 '1' 组成 
// 字符串如果不是 "0" ，就不含前导零 
// 
//
// Related Topics 位运算 数学 字符串 模拟 👍 1214 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        while (indexA >= 0 || indexB >= 0 || carry == 1) {
            int aNum = 0;
            if (indexA >= 0) {
                aNum = a.charAt(indexA) - '0';
            }
            int bNum = 0;
            if (indexB >= 0) {
                bNum = b.charAt(indexB) - '0';
            }
            int sum = aNum + bNum + carry;
            char currentChar = (char) (sum % 2 + '0');
            sb.insert(0, currentChar); // Insert at the beginning to maintain the correct order
            carry = sum / 2;
            indexA--;
            indexB--;
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
