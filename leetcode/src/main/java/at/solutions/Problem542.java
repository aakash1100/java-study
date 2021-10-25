package at.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Problem542 {

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    q.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for(int[] d : directions) {
                    int x = curr[0] + d[0];
                    int y = curr[1] + d[1];

                    if(x < 0 || y < 0 || x >= m || y >= n || visited[x][y]) {
                        continue;
                    }
                    mat[x][y] = mat[curr[0]][curr[1]] + 1;
                    q.offer(new int[]{x,y});
                    visited[x][y] = true;
                }
            }
        }
        return mat;
    }

}
