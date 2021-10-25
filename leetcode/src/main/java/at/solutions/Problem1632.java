package at.solutions;

import java.util.*;
import java.util.stream.IntStream;

public class Problem1632 {

    private class Position {
        int index;
        int row;
        int col;

        Position(int index, int row, int col) {
            this.index = index;
            this.row = row;
            this.col = col;
        }
    }

    private class RankUnionFind {
        int[] parent;
        int[] rank;

        RankUnionFind(int count) {
            parent = new int[count];
            rank = new int[count];
            IntStream.range(0, count).forEach(i -> parent[i] = i);
        }

        int find(int a) {
            if(a == parent[a]) return a;
            return find(parent[a]);
        }

        void union(int a, int b) {
            int rootA = find(a), rootB = find(b);
            if(rootA == rootB) return;

            if(rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if(rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }
        }
    }

    public int[][] matrixRankTransform(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Map<Integer, List<Position>> groupMap = new HashMap<>();
        Set<Integer> uniqueNumbers = new TreeSet<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                uniqueNumbers.add(matrix[i][j]);
                groupMap.putIfAbsent(matrix[i][j], new ArrayList<>());
                List<Position> positionList = groupMap.get(matrix[i][j]);
                positionList.add(new Position(positionList.size(), i, j));
            }
        }

        int[][] ans = new int[m][n];
        int[] maxRankInRow = new int[m];
        int[] maxRankInCol = new int[n];

        for(int number : uniqueNumbers) {
            List<Position> positions = groupMap.get(number);
            RankUnionFind rankUnionFind = new RankUnionFind(positions.size());

            Collections.sort(positions, Comparator.comparingInt(p -> p.row));
            for(int i = 0; i < positions.size() - 1; i++) {
                if(positions.get(i).row == positions.get(i + 1).row) {
                    rankUnionFind.union(positions.get(i).index, positions.get(i + 1).index);
                }
            }

            Collections.sort(positions, Comparator.comparingInt(p -> p.col));
            for(int i = 0; i < positions.size() - 1; i++) {
                if(positions.get(i).col == positions.get(i + 1).col) {
                    rankUnionFind.union(positions.get(i).index, positions.get(i + 1).index);
                }
            }

            Map<Integer, List<Position>> finalConnectedGroup = new HashMap<>();
            for(Position position : positions) {
                int parent = rankUnionFind.find(position.index);
                finalConnectedGroup.putIfAbsent(parent, new ArrayList<>());
                finalConnectedGroup.get(parent).add(position);
            }

            for(List<Position> positionList : finalConnectedGroup.values()) {
                int max = 0;
                for(Position position : positionList) {
                    max = Math.max(maxRankInRow[position.row], max);
                    max = Math.max(maxRankInCol[position.col], max);
                }

                int rank = max + 1;
                for(Position position : positionList) {
                    ans[position.row][position.col] = rank;
                    maxRankInRow[position.row] = rank;
                    maxRankInCol[position.col] = rank;
                }
            }
        }

        return ans;
    }

}



