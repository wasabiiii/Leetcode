/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container and n is at least 2.

  盛水问题，求 max[(j-i)*min(ai,aj)]
 */
public class Solution11 {
    public int maxArea(int[] height) {
        if(height == null || height.length<2)
            return 0;
        int l = 0;//left,最左边
        int r = height.length-1;//right,最右边
        int maxarea = 0;
        while(l<r){
            maxarea = Math.max(maxarea,(r-l)*Math.min(height[r],height[l]));
            if(height[l]<height[r]){//从r-l最大开始，若height[l]的长度小于height[r]，则l右移（盛水的多少取决于短的那一根，移动长的那根并没有用）
                l++;
            }else{
                r--;
            }
        }

        return maxarea;
    }
}
