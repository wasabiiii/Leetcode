/**
 * 给定一个已排序的数组，去除数组中重复的值，并返回新数组的长度n。
 * 只能修改输入的数组inplace
 * 要求：新数组的前n个元素是没有重复的，n个元素后面的元素可与前面重复

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 */

import java.util.Arrays;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int id = 1;
        for(int i = 1; i < n; ++i){
            if(nums[i] != nums[i-1]){
                nums[id] = nums[i];
                ++id;
            }
        }

        return id;
    }

    public static void main(String[] args){
        Solution26 test = new Solution26();
        int[] nums = {1,1,2,3,4,5,5,6,7,8,9,10,11,11};
        int length = test.removeDuplicates(nums);
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
    }

}
