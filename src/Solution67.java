/**
 * Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".

 二进制数的加法

 思路：
 从个位数开始，两两相加（通过减'0'将字符串转换为数字）
 %2 为这个位上的结果数字
 /2 为进位值
 */

public class Solution67 {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length()-1;
        int n = b.length()-1;
        int carry = 0;//进位

        while(m>=0 || n>=0){//m、n为a、b的最后一个数的索引
            int sum = carry;
            if(m>=0){
                sum += a.charAt(m) - '0';//a.charAt(m)-'0'，即字符串相减，实际上是ASCII码对应的数相减，把数字字符串转成数字
                m--;//向前移一位，即相加从最后一位开始从右往左
            }
            if(n>=0){
                sum += b.charAt(n) - '0';
                n--;
            }
            sb.append(sum%2);
            carry = sum/2;

        }

        if(carry == 1){//若最后有进位
            sb.append("1");
        }

        return sb.reverse().toString();//倒置并转成字符串
    }

    public static void main(String[] args) {
        Solution67 test = new Solution67();
        String result = test.addBinary("11","1");
        System.out.println(result);

    }
}
