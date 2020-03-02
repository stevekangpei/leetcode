package com.kangpei.leetcode.listnode.easy;

import com.kangpei.leetcode.listnode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。

 示例 1:

 输入: 1->2
 输出: false
 示例 2:

 输入: 1->2->2->1
 输出: true

 * Created by kangpei on 2020/3/2.
 */
public class IsPalindromeNode {

    /**
     * 可以考虑将链表赋值到数组中，针对数组的处理会变的很简单，使用双指针既可判断
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        List<Integer>  list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int start = 0, end = list.size() -1;
        while (start != end) {

            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
