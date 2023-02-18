package jdk;

/**
 * @author MaXinHang.
 */
public class StringTests {
    /**
     * 使用char数组保存字符串
     *
     */
    public static void main(String[] args) {
        String s = new String("String");

        //substring() 字符串截断
        //trim() 去除字符串两侧空格
        //indexOf() 找到某个字符索引，没找到返回-1(暴力匹配)
        //split() 字符串分割
        //replaceAll() replace() 字符替换
        //contains() 是否存在当前字符串(暴力匹配)
        //concat 字符串拼接
        //intern() 本地方法。如果常量池存在当前字符串，直接返回，否则，当前字符串存入常量池，返回当前对象引用
        //startsWith() endsWith()
        //compareTo()  当前字符与参数字符逐个对比，不同时相减，字符都相同时len相减
    }
}
