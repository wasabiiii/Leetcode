/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

 将给定的字符串从上到下再从下到上按z字形排列，共numRows行，按行输出最后的字符串

 思路：每一行为一个StringBuilder，总体为一个数组，向每一行append元素
 最后将行append起来就可以了
 */

public class Solution6 {

    public String convert(String s, int numRows) {
        StringBuilder[] sb  = new StringBuilder[numRows];

        for(int i = 0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }

        int k = 0;
        int len = s.length();

        while(k<len) {

            for (int row = 0; row < numRows && k<len; row++) {
                sb[row].append(s.charAt(k++));
            }

            for (int row = numRows-2 ; row > 0 && k<len ; row--){
                sb[row].append(s.charAt(k++));
            }

        }

        StringBuilder result = new StringBuilder();

        for(int j=0 ; j<numRows ; j++){
            result.append(sb[j]);
        }

        return result.toString();
    }

    public static void main(String[] args){
        Solution6 test = new Solution6();
        System.out.println(test.convert("PAYPALISHIRING", 3));
    }
}
