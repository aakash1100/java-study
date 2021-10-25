package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCountingSort {

    private CountingSort countingSort = new CountingSort();

    @Test
    public void testCountingSort() {
        int[] nums = {4,3,1,2,2,0,9,1,1,1};
        int[] expected = {0,1,1,1,1,2,2,3,4,9};
        countingSort.sort(nums, 0, 9);
        Assertions.assertArrayEquals(expected, nums);
    }
}
