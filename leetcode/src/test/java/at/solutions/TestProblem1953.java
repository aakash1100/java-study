package at.solutions;

import at.solutions.Problem1953;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1953 {

    private Problem1953 problem1953 = new Problem1953();

    @Test
    public void  testGivenExample1() {
        int[] milestones = {1,2,3};
        long expected = 6;
        Assertions.assertEquals(expected, problem1953.numberOfWeeks(milestones));
    }

    @Test
    public void  testGivenExample2() {
        int[] milestones = {5,2,1};
        long expected = 7;
        Assertions.assertEquals(expected, problem1953.numberOfWeeks(milestones));
    }

}
