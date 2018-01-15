public class Solution43 {
    public String multiply(String num1, String num2) {
        /*int len1 = num1.length()-1;
        int len2 = num2.length()-1;

        StringBuilder sb = new StringBuilder();

        while(len1>0 || len2>0){
            if(len1*len2 != 0){
                int n1 = num1.charAt(len1) - '0';

                int mul = n1*n2 + carry;
                int cur = mul%10;//当前位上的数
                carry = mul/10;//进位
                len1--;
                len2--;
                sb.append(cur);
            }

        }

        for(int j = len2; j >0; j--){
            int n2 = num2.charAt(len2) - '0';
            int carry = 0;
            for (int i = len1; i > 0 ; i--) {
                int n1 = num1.charAt(len1) - '0';
                int mul = n1*n2 + carry;
                int cur = mul%10;//当前位上的数
                carry = mul/10;//进位
            }

        }
        return sb.reverse().toString();*/

        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;//相乘数的位置和
                int p2 = i + j + 1;//进位位位置
                int sum = mul + pos[p2];//乘积+进位

                pos[p1] += sum / 10;//进位
                pos[p2] = (sum) % 10;//该位上的值
                System.out.println("pos["+p1+"]:"+pos[p1]);
                System.out.println("pos["+p2+"]:"+pos[p2]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos)
            if(!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }


        return sb.length() == 0 ? "0" : sb.toString();


    }

    public static void main(String arg[]){
        Solution43 test = new Solution43();
        String result = test.multiply("23","15");
        System.out.println(result);
    }
}
