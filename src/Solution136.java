/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 给定一个整形数组，所有元素都是有两个的，只有一个元素只出现了一次，找出这个元素
 *
 * 思路：使用XOR异或
 * 异或：相同为0不同为1（对于2进制来说），可使用交换律
 * 000000^010101=010101，即0^21=21
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
