package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem48 {

    private Problem48 problem48 = new Problem48();

    @Test
    public void testGivenExample1() {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = {{7,4,1},{8,5,2},{9,6,3}};
        problem48.rotate(input);
        Assertions.assertArrayEquals(expected, input);
    }

    @Test
    public void testGivenExample2() {
        int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expected = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        problem48.rotate(input);
        Assertions.assertArrayEquals(expected, input);
    }
}
