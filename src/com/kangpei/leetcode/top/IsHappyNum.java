package com.kangpei.leetcode.top;


import java.util.HashSet;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。

 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。

 如果 n 是快乐数就返回 True ；不是，则返回 False 。

  

 示例：

 输入：19
 输出：true
 解释：
 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/happy-number
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/24.
 */
public class IsHappyNum {


    public boolean isHappy(int n) {

        HashSet<Integer> integers = new HashSet<>();

        while (n != 1 && !integers.contains(n)) {
            integers.add(n);
            n = getTotal(n);
        }
        return n == 1;
    }

    public int getTotal(int n) {

        int total = 0;

        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            total += d * d;
        }
        return total;
    }
}
