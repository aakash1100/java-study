package at.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem34 {

    int[] nums;

    int target;

    int N;

    public int[] searchRange(int[] nums, int target) {
        N = nums.length - 1;
        this.nums = nums;
        this.target = target;
        return new int[]{find(true), find(false)};
    }

    private int find(boolean isFirst) {
        int mid = -1, left = 0, right = N;
        int index = -1;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                index = mid;
                if(isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
