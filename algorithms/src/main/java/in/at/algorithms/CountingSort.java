package in.at.algorithms;

import in.at.algorithms.util.AlgorithmUtils;

public class CountingSort {

    public void sort(int[] nums, int min, int max) {
        int[] countArr = new int[max - min + 1];

        for(int num : nums) countArr[num]++;

        int num = 0, index = 0;
        for(int i = 0; i < countArr.length; i++) {
            while(countArr[i]-- > 0) nums[index++] = num;
            num++;
        }
    }


}
