/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]

 括号匹配问题：给定数n，列出所有合理的括号形式（n个左括号，n个右括号）

 思路：回溯（深度优先），递归。右括号数一定小于等于左括号

 还有其他解法，参见他人的submission，未看
 */

import java.util.*;

public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {//终止条件
            ans.add(cur);
            return;
        }

        //两条路，都可走
        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);


        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);


    }

    public static void main(String[] args){
        Solution22 test = new Solution22();
        System.out.println(test.generateParenthesis(3));
    }
}
