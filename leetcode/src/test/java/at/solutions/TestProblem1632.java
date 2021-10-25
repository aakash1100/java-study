package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1632 {

    private Problem1632 problem1632 = new Problem1632();

    @Test
    public void  testGivenExample1() {
        int[][] mat = {{1,2},{3,4}};
        int[][] expected = {{1,2},{2,3}};
        Assertions.assertArrayEquals(expected, problem1632.matrixRankTransform(mat));
    }

    @Test
    public void  testGivenExample2() {
        int[][] mat = {{7,7},{7,7}};
        int[][] expected = {{1,1},{1,1}};
        Assertions.assertArrayEquals(expected, problem1632.matrixRankTransform(mat));
    }

    @Test
    public void  testGivenExample3() {
        int[][] mat = {{20,-21,14},{-19,4,19},{22,-47,24},{-19,4,19}};
        int[][] expected = {{4,2,3},{1,3,4},{5,1,6},{1,3,4}};
        Assertions.assertArrayEquals(expected, problem1632.matrixRankTransform(mat));
    }

    @Test
    public void  testGivenExample4() {
        int[][] mat = {{7,3,6},{1,4,5},{9,8,2}};
        int[][] expected = {{5,1,4},{1,2,3},{6,3,1}};
        Assertions.assertArrayEquals(expected, problem1632.matrixRankTransform(mat));
    }

}
