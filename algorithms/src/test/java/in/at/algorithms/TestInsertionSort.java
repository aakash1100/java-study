package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInsertionSort {

    private InsertionSort insertionSort = new InsertionSort();

    @Test
    public void testInsertionSort() {
        int[] nums = {4,3,1,2,99,-1,-22,0,9,1,1,1};
        int[] expected = {-22,-1,0,1,1,1,1,2,3,4,9,99};
        insertionSort.sort(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
