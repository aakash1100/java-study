package at.solutions;

import at.solutions.Problem932;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem932 {

    private Problem932 problem932 = new Problem932();

    @Test
    public void  testGivenExample1() {
        int n = 4;
        int[] expected = {1,3,2,4};
        Assertions.assertArrayEquals(expected, problem932.beautifulArray(n));
    }

    @Test
    public void  testGivenExample2() {
        int n = 5;
        int[] expected = {1,5,3,2,4};
        Assertions.assertArrayEquals(expected, problem932.beautifulArray(n));
    }

    @Test
    public void  test1() {
        int n = 1;
        int[] expected = {1};
        Assertions.assertArrayEquals(expected, problem932.beautifulArray(n));
    }

}
