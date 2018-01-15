/**
 * Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.


 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 手机九宫格，每个数字对应3-4个字母
 输入数字，输出所有可能的对应的字母组合

 思路：

 */
import java.util.*;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length()==0){
            return ans;
        }

        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = digits.charAt(i) - '0';
            System.out.println(x);
            while(ans.peek().length()==i){
                String t = ans.remove();//移除LinkedList的第一个元素
                System.out.println(ans);

                System.out.println("-----");
                for(char s : mapping[x].toCharArray()){//遍历按下的数字键对应的英文字符

                    ans.add(t+s);
                    System.out.println(ans);
                }
                System.out.println("+++++++++++++");

            }
        }
        return ans;
    }

    public static void main(String[] args){
        Solution17 test  = new Solution17();
        List<String> result = test.letterCombinations("23");
        System.out.println(result);
    }
}
