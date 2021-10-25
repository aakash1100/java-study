package at.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem48 {

    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j = m - 1; j >= 0; j--) {
                q.add(matrix[j][i]);
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = q.poll();
            }
        }
    }
}
