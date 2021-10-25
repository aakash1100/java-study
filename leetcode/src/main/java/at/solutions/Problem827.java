package at.solutions;

import java.util.*;

public class Problem827 {

    int n;

    public int largestIsland(int[][] grid) {
        Map<Integer, Integer> areaMap = new HashMap<>();
        n = grid.length;

        int islandId = 2;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = detectAndMarkArea(grid, islandId, i, j);
                    areaMap.put(islandId, area);
                    islandId++;
                }
            }
        }

        int ans = areaMap.getOrDefault(2, 0);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) {
                    Set<Integer> set = new HashSet<>();
                    set.add(i > 0 ? grid[i - 1][j] : 0);
                    set.add(i < n - 1 ? grid[i + 1][j] : 0);
                    set.add(j > 0 ? grid[i][j - 1] : 0);
                    set.add(j < n - 1 ? grid[i][j + 1] : 0);
                    int total = 1;
                    for(Integer id : set) {
                        total += areaMap.getOrDefault(id, 0);
                    }
                    ans = Math.max(ans, total);
                }
            }
        }

        return ans;
    }

    private int detectAndMarkArea(int[][] grid, int islandId, int i, int j) {
        if(i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) return 0;
        grid[i][j] = islandId;
        return 1 + detectAndMarkArea(grid, islandId, i + 1, j)
                + detectAndMarkArea(grid, islandId, i - 1, j)
                + detectAndMarkArea(grid, islandId, i, j + 1)
                + detectAndMarkArea(grid, islandId, i, j - 1);
    }
}
