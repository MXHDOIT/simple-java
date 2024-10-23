//给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。 
//
// 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。 
//
// 
//
// 示例 1: 
//
// 
//输入: num1 = "2", num2 = "3"
//输出: "6" 
//
// 示例 2: 
//
// 
//输入: num1 = "123", num2 = "456"
//输出: "56088" 
//
// 
//
// 提示： 
//
// 
// 1 <= num1.length, num2.length <= 200 
// num1 和 num2 只能由数字组成。 
// num1 和 num2 都不包含任何前导零，除了数字0本身。 
// 
//
// Related Topics 数学 字符串 模拟 👍 1346 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) { return "0"; }
        String result = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            String multiply = multiply(num1, num2.charAt(i), num2.length() - 1 - i);
            result = sum(result, multiply);
        }

        return result;
    }

    private String sum(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }

    private String multiply(String num1, char ch, int zeroSize) {
        char[] num1CharArray = num1.toCharArray();
        int num1Index = num1CharArray.length - 1;
        int carry = 0;
        int chInt = ch - '0';
        StringBuilder sb = new StringBuilder();
        while (zeroSize-- > 0) {
            sb.append('0');
        }
        while (num1Index >= 0) {
            int num1Char = num1CharArray[num1Index] - '0';
            int num = num1Char * chInt + carry;
            char currentChar = (char) (num % 10 + '0');
            sb.insert(0, currentChar);
            carry = num / 10;
            num1Index--;
        }
        if (carry != 0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }


}
//leetcode submit region end(Prohibit modification and deletion)
