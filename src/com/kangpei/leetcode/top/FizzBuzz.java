package com.kangpei.leetcode.top;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。

 1. 如果 n 是3的倍数，输出“Fizz”；

 2. 如果 n 是5的倍数，输出“Buzz”；

 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。



 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/fizz-buzz
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/24.
 */
public class FizzBuzz {


    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);

        for (int i = 1;  i <= n; i++) {

            boolean divideBy3 = (i % 3 == 0) ;
            boolean divideBy5 = (i % 5 == 0) ;
            if (divideBy3 && divideBy5) {
                ans.add("FizzBuzz");
            } else if (divideBy3) {
                ans.add("Fizz");
            }else if (divideBy5) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }

    /**
     * 这个方法可以更好地应对递增复杂度。
     * 比如说从 3， 5 到 3， 5， 7， 10等
     * @param n
     * @return
     */
    public List<String> fizzBuzz1(int n) {

        Map<Integer, String> fizzMap = new HashMap<>();
        fizzMap.put(3, "Fizz");
        fizzMap.put(5, "Buzz");

        List<String> ans = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {

            String str =  "";
            for (Integer integer : fizzMap.keySet()) {
                if (i % integer == 0) {
                    str = str + fizzMap.get(integer);
                }
            }
            if (str.length() == 0) {
                str = String.valueOf(i);
            }
            ans.add(str);
        }
        return ans;

    }
}
