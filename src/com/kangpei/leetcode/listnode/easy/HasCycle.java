package com.kangpei.leetcode.listnode.easy;

import com.kangpei.leetcode.listnode.ListNode;

/**
 * 给定一个链表，判断链表中是否有环。

 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

  

 示例 1：

 输入：head = [3,2,0,-4], pos = 1
 输出：true
 解释：链表中有一个环，其尾部连接到第二个节点。


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/linked-list-cycle
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 LeetCode 141
 * Created by kangpei on 2020/3/2.
 */
public class HasCycle {

    /**
     * 使用快慢指针来实现
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null) {

            if (slow == null || fast.next == null) {
                return false;
            }

            if (slow == fast) {
                return true;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;

    }
}
