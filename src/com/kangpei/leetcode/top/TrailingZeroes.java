package com.kangpei.leetcode.top;

/**
 *给定一个整数 n，返回 n! 结果尾数中零的数量。

 示例 1:

 输入: 3
 输出: 0
 解释: 3! = 6, 尾数中没有零。
 示例 2:

 输入: 5
 输出: 1
 解释: 5! = 120, 尾数中有 1 个零.


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/factorial-trailing-zeroes
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/24.
 */
public class TrailingZeroes {

    /**
     * 主要是计算2 * 5 的数量。看看这个有多少对
     * 但是由于2的数量远大于5，所以只需要计算5的数量就行了。
     * 但是又由于25 可以被除以两次， 所以对于每个数，要除以多次
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {

        int zeroCount = 0;

        for (int i = 5; i <= n; i += 5) {
            int zero = i;
            while (zero % 5 == 0) {
                zeroCount++;
                zero = zero / 5;
            }
        }
        return zeroCount;
    }

    public int trailingZeroes1(int n) {

        int zeroCount = 0;

        while (n > 5) {

            zeroCount += n / 5;
            n = n / 5;
        }
        return zeroCount;
    }
}
