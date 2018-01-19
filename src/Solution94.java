/**
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 return [1,3,2].

 给定一棵二叉树，求它的中序遍历

 思路：递归 或 迭代
 */

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution94 {
    /**
     * 方法1 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        help(root,res);
        return res;
    }

    public void help(TreeNode root,List<Integer> res){
        if(root != null){
            if(root.left != null){
                help(root.left,res);
            }

            res.add(root.val);

            if(root.right != null){
                help(root.right,res);
            }

        }

    }


    /**
     * 方法2：迭代
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !stack.empty())
        {
            if (node != null)
            {
                stack.push(node);
                node = node.left;
            }
            else
            {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }

        return list;
    }
}
