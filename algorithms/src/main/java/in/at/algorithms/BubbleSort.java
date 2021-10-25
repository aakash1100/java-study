package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class BubbleSort {

    public void sort(int[] nums) {
        int N = nums.length;

        for(int unsorted = N - 1; unsorted > 0; unsorted--) {
            boolean noSwap = true;
            for(int j = 0; j < unsorted; j++) {
                if(nums[j] > nums[j + 1]) {
                    AlgorithmUtils.swap(nums, j, j + 1);
                    noSwap = false;
                }
            }
            if(noSwap) break;
        }
    }
}
