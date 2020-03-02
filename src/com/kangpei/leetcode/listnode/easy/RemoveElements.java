package com.kangpei.leetcode.listnode.easy;

import com.kangpei.leetcode.listnode.ListNode;

/**
 * 删除链表中等于给定值 val 的所有节点。

 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5

 LeetCode 203
 * Created by kangpei on 2020/3/2.
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur != null && cur.next !=null) {

            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}
