package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private void mergeSort(int[] nums, int start, int end) {
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums,start, mid, end);
        }
    }

    private void merge(int[] nums, int start, int mid, int end) {
       int leftLength = mid - start + 1;
       int rightLength = end - mid;

       int[] left = new int[leftLength];
       int[] right = new int[rightLength];

       for(int i = 0; i < leftLength; i++) left[i] = nums[start + i];
       for(int i = 0; i < rightLength; i++) right[i] = nums[mid + 1 + i];

       int i = 0, j = 0, k = start;

       while(i < leftLength && j < rightLength) {
           nums[k++] = left[i] <= right[j] ? left[i++] : right[j++];
       }

       while(i < leftLength) nums[k++] = left[i++];
       while(j < rightLength) nums[k++] = right[j++];
    }
}
