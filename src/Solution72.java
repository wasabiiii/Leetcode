/**
 * 思路：dp动态规划
 *
 */

public class Solution72 {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] cost = new int[m + 1][n + 1];

        //边界情况：将i个字符变为0个字符需i步
        for(int i = 0; i <= m; i++)
            cost[i][0] = i;

        //边界情况：将0个字符变为i个字符需i步
        for(int i = 1; i <= n; i++)
            cost[0][i] = i;

        //一般情况
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(word1.charAt(i) == word2.charAt(j))//两个字符相等，多这个字符的花费不变
                    cost[i + 1][j + 1] = cost[i][j];
                else {
                    int a = cost[i][j];//替代
                    int b = cost[i][j + 1];//
                    int c = cost[i + 1][j];//
                    cost[i + 1][j + 1] = a < b ? (a < c ? a : c) : (b < c ? b : c);//
                    cost[i + 1][j + 1]++;
                }
            }
        }
        return cost[m][n];
    }
}
