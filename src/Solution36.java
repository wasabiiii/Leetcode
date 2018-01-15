/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

 请判定一个数独是否有效。
 该数独可能只填充了部分数字，其中缺少的数字用 .表示。

 注意事项：
 一个合法的数独（仅部分填充）并不一定是可解的。我们仅需使填充的空格有效即可。

 思路：每一行、每一列、每一个九宫格是否已有重复的元素
 使用HashSet.add来判断是否有重复

 本题除此方法外有其他速度更快的解法
 */

import java.util.*;

public class Solution36 {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {

            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();

            for (int j = 0; j < 9; j++) {//j能遍历一个九宫格
                if(board[i][j]!='.'&&!row.add(board[i][j]))//若这个位置上的值不为空，且这个值无法再加到hashset中（表示有重复）
                    return false;//该数独不合法

                if(board[j][i]!='.'&&!col.add(board[j][i]))
                    return false;

                int rowindex = 3*(i/3);
                int colindex = 3*(i%3);

                if(board[rowindex+j/3][colindex+j%3]!='.'&&!cube.add(board[rowindex+j/3][colindex+j%3]))
                    return false;
            }
        }

        return true;
    }

}
