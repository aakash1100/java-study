package in.at.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestShellSort {

    private ShellSort shellSort = new ShellSort();

    @Test
    public void testShellSort() {
        int[] nums = {4,3,1,2,-1,-22,0,9,1,1,1};
        int[] expected = {-22,-1,0,1,1,1,1,2,3,4,9};
        shellSort.sort(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
