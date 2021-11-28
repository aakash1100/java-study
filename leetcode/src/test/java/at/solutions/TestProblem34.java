package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem34 {

    private Problem34 problem34 = new Problem34();

    @Test
    public void  testGivenExample1() {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        Assertions.assertArrayEquals(new int[]{3,4}, problem34.searchRange(nums, target));
    }

    @Test
    public void  testGivenExample2() {
        int nums[] = {5,7,7,8,8,10};
        int target = 6;
        Assertions.assertArrayEquals(new int[]{-1,-1}, problem34.searchRange(nums, target));
    }

    @Test
    public void  testGivenExample3() {
        int nums[] = {};
        int target = 0;
        Assertions.assertArrayEquals(new int[]{-1,-1}, problem34.searchRange(nums, target));
    }
}
