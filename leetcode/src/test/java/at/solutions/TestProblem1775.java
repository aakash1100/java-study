package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1775 {

    private Problem1775 problem1775 = new Problem1775();

    @Test
    public void  testGivenExample1() {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {1,1,2,2,2,2};
        int expected = 3;
        Assertions.assertEquals(expected, problem1775.minOperations(nums1, nums2));
    }

    @Test
    public void  testGivenExample2() {
        int[] nums1 = {1,1,1,1,1,1,1};
        int[] nums2 = {6};
        int expected = -1;
        Assertions.assertEquals(expected, problem1775.minOperations(nums1, nums2));
    }

    @Test
    public void  testGivenExample3() {
        int[] nums1 = {6,6};
        int[] nums2 = {1};
        int expected = 3;
        Assertions.assertEquals(expected, problem1775.minOperations(nums1, nums2));
    }

}
