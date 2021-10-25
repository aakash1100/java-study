package at.solutions;

import at.solutions.Problem1952;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1952 {

    private Problem1952 problem1952 = new Problem1952();

    @Test
    public void  testGivenExample1() {
        int n = 2;
        Assertions.assertFalse(problem1952.isThree(n));
    }

    @Test
    public void  testGivenExample2() {
        int n = 4;
        Assertions.assertTrue(problem1952.isThree(n));
    }

}
