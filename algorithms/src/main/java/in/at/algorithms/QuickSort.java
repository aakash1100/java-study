package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class QuickSort {

    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if(start < end) {
            int pivot = partition(nums, start, end);
            quickSort(nums, start, pivot - 1);
            quickSort(nums, pivot + 1, end);
        }
    }

    private int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int lastSmaller = start - 1;

        for(int i = start; i < end; i++) {
            if(nums[i] <= pivot) {
                lastSmaller++;
                AlgorithmUtils.swap(nums, i, lastSmaller);
            }
        }
        AlgorithmUtils.swap(nums, end, lastSmaller + 1);
        return lastSmaller + 1;
    }
}
