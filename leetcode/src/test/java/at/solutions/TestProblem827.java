package at.solutions;

import at.solutions.Problem827;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem827 {

    private Problem827 problem827 = new Problem827();

    @Test
    public void  testGivenExample1() {
        int[][] grid = {{1, 0}, {0, 1}};
        int expected = 3;
        Assertions.assertEquals(expected, problem827.largestIsland(grid));
    }

    @Test
    public void  testGivenExample2() {
        int[][] grid = {{1, 1}, {1, 0}};
        int expected = 4;
        Assertions.assertEquals(expected, problem827.largestIsland(grid));
    }

    @Test
    public void  testGivenExample3() {
        int[][] grid = {{1, 1}, {1, 1}};
        int expected = 4;
        Assertions.assertEquals(expected, problem827.largestIsland(grid));
    }

}
