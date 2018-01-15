/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 给定一个已排序数组（数组中没有重复元素），以及一个target，查找数组中是否有target的存在
 若存在，则返回其index，若不存在，则返回其插入位置，使得插入后的数组仍是一个有序数组

 思路：二分查找
 */

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {//如果low<=high 换成low<high,则查找可能会漏掉匹配元素，如当数组只有一个元素的时候

            //采用(low+high)/2存在溢出的风险
            //我们知道int是16位，最大的值为65535
            //假设你定义的数组是60000,low和high分别为30000，40000，两者相加就会溢出，变成一个负数
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;//若写成end = mid; 考虑数组{2,4,6,8}如果查找一个不再数组中的值1，则会出现死循环。
            } else {
                return mid;
            }
        }

        return start;//若没有找到
    }
}
