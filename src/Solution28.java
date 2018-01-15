/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * 字符串匹配：若haystack中存在needle这个字符串，则返回第一次出现的位置；若不存在，则返回-1
 */
public class Solution28 {

    //方法1：一个字符一个字符判断
    /*public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {//第一个对应的索引为i
            for (int j = 0; ; j++) {//j为needle的第j个字符
                if (j == needle.length()) return i;//j通过了之前的所有判断，到达needle.length()的时候，说明完全匹配成功了
                if (i + j == haystack.length()) return -1;//到haystack的末尾还没有判断成功，则没找到，返回-1
                if (needle.charAt(j) != haystack.charAt(i + j)) break;//若第j个字母不对应，则跳出这个循环，i往下走一个
            }
        }
    }*/

    //方法2：使用substring判断
    /*public int strStr1(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }*/

    //方法3：使用indexOf判断
    public int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    //效率上来说：方法3效率高于2高于1

    public static void main(String[] args){
        Solution28 test = new Solution28();
        String haystack = "aaaaa", needle = "bba";
        int result = test.strStr2(haystack,needle);
        System.out.println(result);
    }
}
