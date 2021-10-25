package at.solutions;

import at.common.TreeNode;

import java.util.*;

public class Problem113 {

    List<List<Integer>> ans;

    int target;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans =  new ArrayList<>();
        target = targetSum;
        traverse(root, new ArrayList<>(), 0);
        return new ArrayList<>(ans);
    }

    private void traverse(TreeNode node, List<Integer> path, int total) {
        if(node == null) return;

        total += node.val;
        path.add(node.val);

        if(node.left == null && node.right == null) {
            if(total == target && !path.isEmpty()) ans.add(path);
            return;
        }

        List<Integer> left = new ArrayList<>();
        left.addAll(path);
        traverse(node.left, left, total);

        List<Integer> right = new ArrayList<>();
        right.addAll(path);
        traverse(node.right, right, total);
    }

}
