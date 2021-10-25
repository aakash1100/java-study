package at.solutions;

import at.common.p429.Node;

import java.util.*;

public class Problem429 {

    List<List<Integer>> ans;

    public List<List<Integer>> levelOrder(Node root) {
        ans = new ArrayList<>();
        if(root != null) {
            ans.add(Arrays.asList(root.val));
            level(root.children);
        }

        return ans;
    }

    private void level(List<Node> childrenN) {
        List<Integer> children = new ArrayList<>();
        List<Node> childrenNodes = new ArrayList<>();
        for(Node child : childrenN) {
            children.add(child.val);
            for(Node c : child.children) {
                childrenNodes.add(c);
            }
        }

        if(!children.isEmpty()) {
            ans.add(children);
            level(childrenNodes);
        }
    }
}
