package com.kangpei.leetcode.listnode.easy;


import com.kangpei.leetcode.listnode.ListNode;

/**反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL

 LeetCode 206题
 * Created by kangpei on 2020/3/2.
 */
public class ReverseList {


    /**
     * 假设是 1-->2
     * 第一轮循环
     * next = 2
     * head = 1
     * pre = 1,
     * head = 2
     * 第二轮循环
     * next = null
     * head 2-> 1
     * pre = 2-> 1
     * head = null
     * 第三轮循环
     * 无
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode next = null;

        while (head != null) {

            next = head.next;
            head.next = pre; // 将head节点的末尾指向pre。
            pre = head;
            head = next;
        }
        return pre;

    }
}
