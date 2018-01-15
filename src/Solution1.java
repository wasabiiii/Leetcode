/**
 * ceshi
 */

import java.util.*;
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        /*for (int i = 0; i < nums.length; i++) {
            int yu = target - nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                if(yu==nums[j]){
                    int[] index = {i,j};
                    return index;
                }
               // break;
            }
        }*/

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        Solution1 test = new Solution1();
        int[] nums = {2, 15, 7, 11};
        int target = 9;
        int[] index = test.twoSum(nums,target);
        for (int element: index) {
            System.out.print(element+",");
        }

    }
}
