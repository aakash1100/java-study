package at.solutions;

import java.util.*;

public class Problem90 {

    List<List<Integer>> ans = new ArrayList<>();

    int N;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        N = nums.length;
        findSubsets(0, nums, new ArrayList<>());
        return ans;
    }

    public void findSubsets(int start, int[] nums, List<Integer> subset) {
        ans.add(new ArrayList<>(subset));
        for(int i = start; i < N; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            subset.add(nums[i]);
            findSubsets(i + 1, nums, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
