package com.kangpei.leetcode.stack.easy;

import java.util.Stack;

/**
 * 设计一个有getMain的栈
 * 在实现了栈功能的基础上，在实现返回栈的最小元素的操作。
 * Created by kangpei on 2020/2/12.
 */
public class GetMainStack {

    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    public GetMainStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int num) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(num);
        } else if (num < this.stackMin.peek()) {
            this.stackMin.push(num);
        }

        this.stackData.push(num);
    }

    public Integer pop() {

        if (this.stackMin.isEmpty()) {
            throw  new RuntimeException("stack is empty");
        }

        int value = this.stackData.pop();
        if (value == stackMin.peek()) {
            stackMin.pop();
        }
        return value;
    }

    public Integer getMin() {
        if (this.stackMin.isEmpty()) {
            throw  new RuntimeException("stack is empty");
        }
        return this.stackMin.peek();
    }
}
