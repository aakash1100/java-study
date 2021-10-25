package at.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public int[] twoSum(int[] nums, int target) {
        final int N = nums.length;

        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            numMap.put(nums[i], i);
        }

        for(int i = 0; i < N; i++) {
            Integer index = numMap.get(target - nums[i]);
            if(index != null && index != i) {
                return new int[]{i, index};
            }
        }

        return null;
    }
}
