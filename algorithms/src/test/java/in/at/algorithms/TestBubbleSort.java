package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBubbleSort {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testBubbleSort() {
        int[] nums = {4,3,1,2};
        int[] expected = {1,2,3,4};
        bubbleSort.sort(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
