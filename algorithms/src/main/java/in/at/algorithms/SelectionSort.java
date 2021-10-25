package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class SelectionSort {

    public void sort(int[] nums) {
        int N = nums.length;

        for(int unsorted = N - 1; unsorted > 0; unsorted--) {
            int maxElIndex = 0;

            for(int j = 0; j <= unsorted; j++) {
                if(nums[j] > nums[maxElIndex]) {
                    maxElIndex = j;
                }
            }

            AlgorithmUtils.swap(nums, maxElIndex, unsorted);
        }
    }
}
