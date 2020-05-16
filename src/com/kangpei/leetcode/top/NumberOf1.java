package com.kangpei.leetcode.top;

/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。


 * Created by kangpei on 2020/5/17.
 */
public class NumberOf1 {

    public int hammingWeight(int n) {

        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n-1);
        }
        return sum;
    }

}
