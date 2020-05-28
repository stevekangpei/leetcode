package com.kangpei.leetcode.top;

/**
 * 统计所有小于非负整数 n 的质数的数量。

 示例:

 输入: 10
 输出: 4
 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。

 * Created by kangpei on 2020/5/24.
 */
public class CountPrimes {

    public int countPrimes(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (isPrime(i)) count++;
        }
        return count;
    }

    public boolean isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) return false;
        }
        return true;
    }

}
