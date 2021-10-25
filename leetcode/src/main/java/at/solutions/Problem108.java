package at.solutions;

import at.common.TreeNode;

public class Problem108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        int N = nums.length;
        TreeNode root = getRoot(nums, 0, N - 1);
        return root;
    }

    private TreeNode getRoot(int[] nums, int left, int right) {
        if(right < left) {
            return null;
        }

        if(left == right) {
            TreeNode node = new TreeNode(nums[left]);
            return node;
        }

        int mid = (right + left) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        if(mid > left) root.left = getRoot(nums, left, mid - 1);
        if(mid < right) root.right = getRoot(nums, mid + 1, right);

        return root;
    }
}
