/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * 思路：
 * 动态规划dp
 * sum(0,i) = a[i] + (sum(0,i-1) < 0 ? 0 : sum(0,i-1))
 * 若前面的和小于0，则a[i]加上前面的会使本身变小，所以从自身开始
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        if(nums ==null || nums.length ==0){
            return 0;
        }

        int sum = nums[0];
        int n = nums.length;
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            if(sum<0){
                sum = nums[i];
            }else{
                sum = sum + nums[i];
            }
            max = Math.max(sum,max);
        }

        return max;
    }

}
