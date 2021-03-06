package com.kangpei.leetcode.listnode.easy;

import com.kangpei.leetcode.listnode.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

 示例 1:

 输入: 1->1->2
 输出: 1->2
 示例 2:

 输入: 1->1->2->3->3
 输出: 1->2->3


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/3/2.
 * LeetCode 83题
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }else {
                node = node.next;
            }

        }
        return head;
    }
}
