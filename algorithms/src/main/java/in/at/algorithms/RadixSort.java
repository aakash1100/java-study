package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class RadixSort {

    public void sort(int[] nums, int radix, int width) {
        for(int i = 0; i < width; i++) {
            radixSort(nums, i, radix);
        }
    }

    private void radixSort(int[] nums, int position, int radix) {
        int  N = nums.length;
        int count[] = new int[radix];
        for(int num : nums) {
            count[getDigit(position, num, radix)]++;
        }

        for(int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
        }

        int[] temp = new int[N];
        for(int i = N - 1; i >= 0; i--) {
            temp[--count[getDigit(position, nums[i], radix)]] = nums[i];
        }

        for(int i = 0; i < N; i++) {
            nums[i] = temp[i];
        }
    }

    private int getDigit(int position, int num, int radix) {
        return num / (int) Math.pow(radix, position) % radix;
    }
}
