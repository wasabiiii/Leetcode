/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * 蜗牛爬井问题
 * 每天能爬1步或2步，到达顶部需要n步。问共有几种方法到达顶部
 *
 * 思路:到达第i步有两种方法
 * 1.从i-1步再走一步
 * 2.从i-2步再走两步
 *
 * 所以走到i步的方法数= (i-2)的方法数+ (i-1)的方法数
 * dp[i]=dp[i−1]+dp[i−2]
*/
public class Solution70 {
    public int climbStairs(int n) {
        if( n == 1){
            return 1;
        }

        int[] climb = new int[n+1];
        climb[1] = 1;
        climb[2] = 2;
        for (int i = 3; i < n+1 ; i++) {
            climb[i] = climb[i-1]+climb[i-2];
        }

        return climb[n];
    }
}
