package at.solutions;

import at.solutions.Problem1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1 {

    private Problem1 problem1 = new Problem1();

    @Test
    public void testGivenExample1() {
        int[] nums = {2,7,11,15};
        int expected[] = {0,1};
        Assertions.assertArrayEquals(expected, problem1.twoSum(nums, 9));
    }

    @Test
    public void testGivenExample2() {
        int[] nums = {3,2,4};
        int expected[] = {1, 2};
        Assertions.assertArrayEquals(expected, problem1.twoSum(nums, 6));
    }

    @Test
    public void testGivenExample3() {
        int[] nums = {3, 3};
        int expected[] = {0,1};
        Assertions.assertArrayEquals(expected, problem1.twoSum(nums, 6));
    }
}
