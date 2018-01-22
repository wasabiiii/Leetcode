/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]

 给定一棵二叉树，返回它的层序遍历

 思路：递归
 */



import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(0,root,res);
        return res;
    }

    public void helper(int height,TreeNode node,List<List<Integer>> res){
        if(node == null) return;
        if(height>=res.size())
            res.add(new ArrayList<Integer>());

        res.get(height).add(node.val);

        helper(height+1,node.left,res);
        helper(height+1,node.right,res);

    }
}
