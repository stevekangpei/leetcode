package com.kangpei.leetcode.dp.easy;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：

 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶
 示例 2：

 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/climbing-stairs
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/2/16.
 */
public class ClimbStairs {


    /**
     * 不难发现，这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建，
     * 我们可以使用动态规划来解决这一问题。

     第
     i
     i 阶可以由以下两种方法得到：
        第i-1阶向上爬一节楼梯
        第i-2阶向上爬2阶
     dp[i]=dp[i−1]+dp[i−2]



     作者：LeetCode
     链接：https://leetcode-cn.com/problems/climbing-stairs/solution/pa-lou-ti-by-leetcode/
     来源：力扣（LeetCode）
     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1; dp[2] = 2;

        for (int i = 3; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
