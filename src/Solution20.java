/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.

 The brackets must close in the correct order,
 "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

 括号匹配问题

 思路：栈
 */

import java.util.*;

public class Solution20 {
    public boolean isValid(String s) {

        if(s.length() % 2 == 1)//若为奇数个，肯定是不匹配的
            return false;

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(')');//压栈
            }
            else if(s.charAt(i) == '{')
            {
                stack.push('}');
            }
            else if(s.charAt(i) == '[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != s.charAt(i))//不是({[，只能是)}]了，此时栈为空，说明缺右括号，false；若也不对应出栈的，false
                return false;
        }

        return stack.isEmpty();//所有的符号都判断过了，若此时栈不为空，说明多了右括号，则为false；为空，则true
    }
}
