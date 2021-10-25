package at.solutions;

import java.util.Arrays;

public class Problem877 {

    int[] piles;

    int N;

    int[][] cache;

    public boolean stoneGame(int[] piles) {
        N = piles.length;
        this.piles = piles;
        cache = new int[501][501];
        for(int[] arr : cache) {
            Arrays.fill(arr, -1);
        }
        return difference(0, N - 1) > 0;
    }

    private int difference(int start, int end) {
        if(start > end) return 0;

        if(cache[start][end] == -1) {
            cache[start][end] = Math.max(piles[start] - difference(start + 1, end),
                    piles[end] - difference(start, end - 1));
        }

        return cache[start][end];
    }
}
