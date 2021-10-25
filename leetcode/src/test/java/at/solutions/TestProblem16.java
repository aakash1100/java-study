package at.solutions;

import at.solutions.Problem16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem16 {

    private Problem16 problem16 = new Problem16();

    @Test
    public void testGivenExample1() {
        int[] nums = {-1,2,1,-4};
        int expected = 2;
        int actual = problem16.threeSumClosest(nums, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllPositive() {
        int[] nums = {11,2,3,4,5,0};
        int expected = 9;
        int actual = problem16.threeSumClosest(nums, 9);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0,0,0,0,0,0};
        int expected = 0;
        int actual = problem16.threeSumClosest(nums, 1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAllNegatives() {
        int[] nums = {-12,-11,-2,-4,-99};
        int expected = -17;
        int actual = problem16.threeSumClosest(nums, -16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRandom() {
        int[] nums = {-12,1,-2,-4,99,77,1,2,3,6,6,6,6,66,0,-66};
        int expected = 0;
        int actual = problem16.threeSumClosest(nums, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSorted() {
        int[] nums = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        Assertions.assertEquals(0, problem16.threeSumClosest(nums, 0));
        Assertions.assertEquals(1, problem16.threeSumClosest(nums, 1));
        Assertions.assertEquals(12, problem16.threeSumClosest(nums, 12));
        Assertions.assertEquals(12, problem16.threeSumClosest(nums, 99));
        Assertions.assertEquals(-12, problem16.threeSumClosest(nums, -300));
    }

    @Test
    public void testFailed1() {
        int[] nums = {0,1,2};
        int expected = 3;
        int actual = problem16.threeSumClosest(nums, 3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFailed2() {
        int[] nums = {1,1,1,0};
        int expected = 2;
        int actual = problem16.threeSumClosest(nums, -100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFailed3() {
        int[] nums = {1,2,4,8,16,32,64,128};
        int expected = 82;
        int actual = problem16.threeSumClosest(nums, 82);
        Assertions.assertEquals(expected, actual);
    }
}
