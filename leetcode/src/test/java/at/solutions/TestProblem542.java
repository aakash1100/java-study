package at.solutions;

import at.solutions.Problem542;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem542 {

    private Problem542 problem542 = new Problem542();

    @Test
    public void  testGivenExample1() {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] expected = {{0,0,0},{0,1,0},{0,0,0}};
        Assertions.assertArrayEquals(expected, problem542.updateMatrix(mat));
    }

    @Test
    public void  testGivenExample2() {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] expected = {{0,0,0},{0,1,0},{1,2,1}};
        Assertions.assertArrayEquals(expected, problem542.updateMatrix(mat));
    }

    @Test
    public void  testFailed1() {
        int[][] mat = {{0},{0},{0}};
        int[][] expected = {{0},{0},{0}};
        Assertions.assertArrayEquals(expected, problem542.updateMatrix(mat));
    }

}
