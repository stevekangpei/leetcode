package com.kangpei.leetcode.top;

/**
 *
 * 实现 strStr() 函数。

 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

 示例 1:

 输入: haystack = "hello", needle = "ll"
 输出: 2
 示例 2:

 输入: haystack = "aaaaa", needle = "bba"
 输出: -1
 说明:

 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。



 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/implement-strstr
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/11.
 */
public class StrStr {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }

        int length = needle.length();

        int start = 0;

        while (start < haystack.length() - length + 1) {

            while (start < haystack.length() - length + 1 && haystack.charAt(start) != needle.charAt(0))
                start++;

            int i = 0, cutLen = 0;
            while (i < length && start < haystack.length() && haystack.charAt(start) == needle.charAt(i)) {
                i++;
                cutLen++;
                start++;
            }
            if (cutLen == length)
                return start - cutLen;
            else
                start = start - cutLen + 1;
        }
        return -1;
    }
}
