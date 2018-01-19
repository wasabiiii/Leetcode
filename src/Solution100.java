/**
 * Given two binary trees, write a function to check if they are the same or not.

 Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

 判断两棵二叉树是否完全相同

 思路：递归
 若根的值相同，则判断左右子树是否相同
 */
public class Solution100 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null && q==null) return true;//若都为空，则相同
        if (p==null || q==null) return false;//若一个为空，一个不为空，则不同

        if(p.val == q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }
}
