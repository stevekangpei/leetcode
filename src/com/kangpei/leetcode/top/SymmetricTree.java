package com.kangpei.leetcode.top;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。

  

 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

 1
 / \
 2   2
 / \ / \
 3  4 4  3
  

 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

 1
 / \
 2   2
 \   \
 3    3


 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/symmetric-tree
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by kangpei on 2020/5/11.
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return (root1.val == root2.val)
                && (isMirror(root1.left, root2.right))
                && (isMirror(root1.right, root2.left));
    }

    public boolean isSymmetric1(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);

        while (queue.size() > 0) {

            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null) continue;
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;

            queue.add(node1.left);
            queue.add(node2.right);

            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }
}
