package at.solutions;

import at.solutions.Problem42;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem42 {

    private Problem42 problem42 = new Problem42();

    @Test
    public void testGivenExample1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        Assertions.assertEquals(expected, problem42.trap(height));
    }

    @Test
    public void testGivenExample2() {
        int[] height = {4,2,0,3,2,5};
        int expected = 9;
        Assertions.assertEquals(expected, problem42.trap(height));
    }
}
