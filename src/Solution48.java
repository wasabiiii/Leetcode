/**
 * 将一个矩阵顺时针(clockwise)旋转90度

 * 思路：
 * clockwise rotate
 * first reverse up to down, then swap the symmetry
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
 * 首先将行颠倒，然后把对角线两边的数字互换
 *
 * 若为逆时针：
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
 * 首先从左到右列互换，然后把对角线两边的数字互换
 */
public class Solution48 {
    public void rotate(int[][] matrix) {
        //顺时针旋转

        int n = matrix.length-1;
        for (int i = 0; i < n ; i++) {
            int[] temp;
            temp = matrix[i];
            matrix[i] = matrix[n];
            matrix[n] = temp;
            n--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }


    //也可以用这种直接旋转的方法。运行速度更快
    public void rotate2(int[][] matrix) {
        int l = matrix.length;
        if (l == 1) return;
        for (int i = 0; i < l/2; i++) {
            int first = i;
            int last = l-1-i;
            for (int j=first; j<last; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[l-1-j][i];
                matrix[l-1-j][i] = matrix[l-1-i][l-1-j];
                matrix[l-1-i][l-1-j] = matrix[j][l-1-i];
                matrix[j][l-1-i] = temp;
            }
        }
    }
}

