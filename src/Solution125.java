/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.

 判断字符串是否为回文（只考虑字母数字）

 */
public class Solution125 {

    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        int j = len - 1;
        for (int i = 0; i < j;) {
            //注意：每次都要比较i或j变化都要做比较是否i < j
            if (!Character.isLetterOrDigit(c[i])) {//如果既不是数字也不是字母（即标点或空格）
                i++;
            }else if (!Character.isLetterOrDigit(c[j])) {//如果既不是数字也不是字母（即标点或空格）
                j--;
            }else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) {//都转换成小写
                return false;
            }
        }

        return true;
    }

}
