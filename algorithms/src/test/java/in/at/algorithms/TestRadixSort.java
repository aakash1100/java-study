package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadixSort {

    private RadixSort radixSort = new RadixSort();

    @Test
    public void testRadixSort() {
        int[] nums = {44,12,34,45,67,78,89};
        int[] expected = {12,34,44,45,67,78,89};
        radixSort.sort(nums, 10, 2);
        Assertions.assertArrayEquals(expected, nums);
    }
}
