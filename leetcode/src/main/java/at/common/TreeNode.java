package at.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> toList() {
        List<Integer> nodes = new ArrayList<>();
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(this);

        while(!nodeQ.isEmpty()) {
            TreeNode node = nodeQ.poll();
            nodes.add(node == null ? null : node.val);

            if(node != null) {
                if(node.left != null || node.right != null) {
                    nodeQ.add(node.left);
                    nodeQ.add(node.right);
                }
            }
        }

        return nodes;
    }

    private void addInList(TreeNode node, List<TreeNode> nodes) {
        nodes.add(node);
        if(node != null) {
            addInList(node.left, nodes);
            addInList(node.right, nodes);
        }
    }

}
