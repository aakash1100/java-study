package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuickSort {

    private QuickSort quickSort = new QuickSort();

    @Test
    public void testQuickSort() {
        int[] nums = {4,3,1,2,-1,-22,0,9,1,1,1};
        int[] expected = {-22,-1,0,1,1,1,1,2,3,4,9};
        quickSort.sort(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
