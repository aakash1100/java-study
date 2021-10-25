package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class InsertionSort {

    public void sort(int[] nums) {
        int N = nums.length;

        for(int firstUnsorted = 1; firstUnsorted < N; firstUnsorted++) {
            int newElement = nums[firstUnsorted];

            int index = firstUnsorted;

            while(index > 0 && nums[index - 1] > newElement) {
                nums[index] = nums[index - 1];
                index--;
            }
            nums[index] = newElement;
        }
    }
}
