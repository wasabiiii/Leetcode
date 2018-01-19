/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

 For example,
 Given n = 3, there are a total of 5 unique BST's.

 1         3     3      2      1
 \       /     /      / \      \
 3     2     1      1   3      2
 /     /       \                 \
 2     1         2                 3

 1,2,3,4,...,n 共能生成多少种不同的二叉搜索树（二叉排序树）

 思路：
 二叉搜索树：左子树的数值都小于根，右子树的数都大于跟。中序遍历树得到的是从小到大排序后的数组
 根为k，则左子树为1,2..k-1;右子树k+1,k+2...n
 n=0，空树，也算一种树
 n=1，树只有根，1种树

 可用递归(recursion)和迭代(iterate)来做
 */

import java.util.*;

public class Solution96 {

    //方法1
    public int numTrees(int n) {
        int[] nums = new int[n+1];

        nums[0] = 1;
        nums[1] = 1;

        for (int k = 2; k < n+1 ; k++) {
            for (int i = 0,j = k-1; i < k && j>=0; i++,j--) {
                nums[k] += nums[i]*nums[j];
            }
        }
        return nums[n];

    }

    //方法2：递归
    public int numTrees2(int n){
        return calculate(n,new int[n+1]);
    }

    public int calculate(int n,int[] nums){

        if(n<=1) return 1;//n=0或1，答案都为1
        if(nums[n] > 0) return nums[n];//若这个值已经计算过，则直接返回

        //若这个值尚未计算过
        int count = 0;
        for (int k = 1; k <= n ; k++) {
            int left = calculate(k-1,nums);
            int right = calculate(n-k,nums);

            count += left*right;//1,2,3...n的不同BST树的种类为：以1为根+以2为根+...+以n为根
        }

        nums[n] =count ;
        return count;
    }
}
