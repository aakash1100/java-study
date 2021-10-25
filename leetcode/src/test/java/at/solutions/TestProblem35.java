package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem35 {

    private Problem35 problem35 = new Problem35();

    @Test
    public void  testGivenExample1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        Assertions.assertEquals(expected, problem35.searchInsert(nums, target));
    }

    @Test
    public void  testGivenExample2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        Assertions.assertEquals(expected, problem35.searchInsert(nums, target));
    }

    @Test
    public void  testGivenExample3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int expected = 4;
        Assertions.assertEquals(expected, problem35.searchInsert(nums, target));
    }

    @Test
    public void  testGivenExample4() {
        int[] nums = {1,3,5,6};
        int target = 0;
        int expected = 0;
        Assertions.assertEquals(expected, problem35.searchInsert(nums, target));
    }

    @Test
    public void  testGivenExample5() {
        int[] nums = {1};
        int target = 0;
        int expected = 0;
        Assertions.assertEquals(expected, problem35.searchInsert(nums, target));
    }
}
