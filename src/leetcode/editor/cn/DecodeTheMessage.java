package leetcode.editor.cn;

//给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下： 
//
// 
// 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。 
// 将替换表与普通英文字母表对齐，形成对照表。 
// 按照对照表 替换 message 中的每个字母。 
// 空格 ' ' 保持不变。 
// 
//
// 
// 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' -> 
//'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。 
// 
//
// 返回解密后的消息。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t s
//uepuv"
//输出："this is a secret"
//解释：对照表如上图所示。
//提取 "the quick brown fox jumps over the lazy dog" 中每个字母的首次出现可以得到替换表。
// 
//
// 示例 2： 
//
// 
//
// 
//输入：key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk
// vcnjrdb"
//输出："the five boxing wizards jump quickly"
//解释：对照表如上图所示。
//提取 "eljuxhpwnyrdgtqkviszcfmabo" 中每个字母的首次出现可以得到替换表。
// 
//
// 
//
// 提示： 
//
// 
// 26 <= key.length <= 2000 
// key 由小写英文字母及 ' ' 组成 
// key 包含英文字母表中每个字符（'a' 到 'z'）至少一次 
// 1 <= message.length <= 2000 
// message 由小写英文字母和 ' ' 组成 
// 
// Related Topics 哈希表 字符串 
// 👍 39 👎 0

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public static void main(String[] args) {
        Solution solution = new DecodeTheMessage().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String decodeMessage(String key, String message) {
            Map<Character, Character> map = new HashMap<>();
            char[] chars = key.toCharArray();
            char base = 'a';
            for (char aChar : chars) {
                if (aChar <= 'z' && aChar >= 'a' && map.get(aChar) == null) {
                    map.put(aChar, base++);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (c <= 'z' && c >= 'a') {
                    Character character = map.get(c);
                    sb.append(character);
                }else {
                    sb.append(c);
                }

            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}