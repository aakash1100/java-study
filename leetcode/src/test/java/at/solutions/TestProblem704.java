package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem704 {

    private Problem704 problem704 = new Problem704();

    @Test
    public void  testGivenExample1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int expected = 4;
        Assertions.assertEquals(expected, problem704.search(nums, target));
    }

    @Test
    public void  testGivenExample2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int expected = -1;
        Assertions.assertEquals(expected, problem704.search(nums, target));
    }

    @Test
    public void  testFailedTestCase1() {
        int[] nums = {5};
        int target = 5;
        int expected = 0;
        Assertions.assertEquals(expected, problem704.search(nums, target));
    }
}
