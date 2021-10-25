package at.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem36 {

    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        final int[][] mat = {{0,1,2},{3,4,5},{6,7,8}};

        Set<Character> distinctRow = new HashSet<>();
        Set<Character> distinctCol = new HashSet<>();
        List<Set<Character>> distinctBoxes = new ArrayList<>();
        for (int i = 0; i < N; i++) distinctBoxes.add(new HashSet<>());

        for(int i = 0 ; i < N; i++) {

            for(int j = 0; j < N; j++) {
                if(distinctRow.contains(board[i][j])) return false;
                else if(board[i][j] != '.') distinctRow.add(board[i][j]);

                if(distinctCol.contains(board[j][i])) return false;
                else if(board[j][i] != '.') distinctCol.add(board[j][i]);

                int index = mat[i / 3][j / 3];
                if(distinctBoxes.get(index).contains(board[i][j])) return false;
                else if(board[i][j] != '.') distinctBoxes.get(index).add(board[i][j]);
            }
            distinctRow.clear();
            distinctCol.clear();
        }

        return true;
    }
}
