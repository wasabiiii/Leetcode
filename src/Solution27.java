/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:

 Given nums = [3,2,2,3], val = 3,

 Your function should return length = 2, with the first two elements of nums being 2.

 给定一个数组nums和一个数val，将数组中与val相等的数字都去除，返回去除后的数组的长度
 只能修改数组in-place，最终数组中数字的顺序可以被改变
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length - 1;
        int i = 0;
        while (i <= n) {
            if (nums[i] == val) {//若当前数字与val相等，则将数组中最后一个数字放到当前位置上覆盖这个数字，并使数组大小减1
                nums[i] = nums[n];
                n--;
            } else {
                i++;
            }
        }

        return n + 1;
    }
}

