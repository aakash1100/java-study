package at.solutions;

import java.util.Arrays;

public class Problem16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int N = nums.length;

        int n1 = nums[0];
        int n2 = nums[1];
        int n3 = nums[N - 1];

        int ans = n1 + n2 + n3;

        for(int i = 0; i < N - 2; i++) {
            int start = i + 1, end = N - 1;

            while(start < end) {
                int sum = nums[start]  + nums[end] + nums[i];
                if(sum < target) start++;
                else end--;

                if(Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
            }
        }

        return ans;
    }
}
