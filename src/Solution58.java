public class Solution58 {

    public int lengthOfLastWord(String s) {
        int len=s.length(), lastLength=0;

        while(len > 0 && s.charAt(len-1)!=' '){
            len--;
            lastLength++;
        }

        /*while(len > 0 && s.charAt(len-1)!=' '){
            lastLength++;
            len--;
        }*/

        return lastLength;
    }

    public static void main(String[] args){
        Solution58 test = new Solution58();
        int lastLength = test.lengthOfLastWord("hello world");
        System.out.println(lastLength);
    }
}
