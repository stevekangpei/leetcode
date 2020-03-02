package com.kangpei.leetcode.listnode.easy;

import com.kangpei.leetcode.listnode.ListNode;

/**
 * 找到两个链表相交的起点。
 * leetcode 106
 * Created by kangpei on 2020/3/2.
 */
public class IntersectionNode {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = length(headA);
        int lengthB = length(headB);
        ListNode longNode = lengthA > lengthB ? headA : headB;
        ListNode shortNode = lengthA > lengthB ? headB : headA;

        int k = Math.abs(lengthA - lengthB);
        while (k-- > 0) {
            longNode = longNode.next;
        }

        while (longNode != null && shortNode !=null) {

            if (longNode == shortNode) {
                return shortNode;
            }
        }
        return null;
    }


    public int length(ListNode head) {
        ListNode node = head;
        int length = 0;

        while (node != null) {

            length++;
            node = node.next;
        }
        return length;
    }


    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
