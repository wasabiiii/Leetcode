/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric

 But the following [1,2,2,null,3,null,3] is not

 给定一棵二叉树，判断它是否对称

 思路：递归（思路可参考判断两个二叉树是否相等）
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return func(root.left, root.right);
    }

    public boolean func(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return true;
        else if(t1 != null && t2 != null && t1.val == t2.val) {
            return func(t1.left, t2.right) && func(t1.right, t2.left);
        }
        else
            return false;
    }
}
