package at.util;

import at.common.p429.Node;
import at.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public final class LeetCodeTestUtils {

    private LeetCodeTestUtils(){}

    public static Node naryTree(Integer[] arr) {
        List<List<Node>> children = new ArrayList<>();
        Node rootNode = null;

        for(int i = 0; i < arr.length; i++) {
            List<Node> temp = new ArrayList<>();
            while(i < arr.length && arr[i] != null) {
                Node node = new Node((int) arr[i]);
                node.children = new ArrayList<>();
                if(rootNode == null) {
                    rootNode = node;
                }
                temp.add(node);
                i++;
            }
            children.add(temp);
        }

        int parentIndex = 0;
        int childrenIndex = parentIndex + 1;

        while(parentIndex < children.size()) {
            List<Node> parents = children.get(parentIndex);

            for(Node node : parents) {
                if(childrenIndex < children.size()) {
                    node.children.addAll(children.get(childrenIndex++));
                }
            }
            parentIndex++;
        }

        return rootNode;
    }

    public static <T> List<List<T>> twoDArrayToListOfList(T[][] toDArr) {
        List<List<T>> list = new ArrayList<>();
        for(T[] arr : toDArr) {
            List<T> ilist = new ArrayList<>();
            for(T a : arr) {
                ilist.add(a);
            }
            list.add(ilist);
        }
        return list;
    }

    public static TreeNode treeNodeBST(Integer[] arr) {
        return toBST(arr, 0, arr.length - 1);
    }

    private static TreeNode toBST(Integer[] arr, int start, int end) {
        if(start > end) return null;
        if(start == end) return new TreeNode(arr[start]);

        int mid = start + (end - start) / 2;
        if(arr[mid] != null) {
            TreeNode node = new TreeNode(arr[mid]);
            node.left = toBST(arr, start, mid - 1);
            node.right = toBST(arr, mid + 1, end);
            return node;
        }
        return null;
    }

    public static TreeNode toTreeNode(Integer[] arr) {
        int index = 0, N = arr.length;
        TreeNode root = new TreeNode(arr[index++]);
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while(index < N) {
            List<TreeNode> nextRoots = new ArrayList<>();
            for(TreeNode node : nodes) {
                if(index < N) {
                    if(arr[index] != null) {
                        node.left = new TreeNode(arr[index]);
                        nextRoots.add(node.left);
                    }
                    index++;
                }

                if(index < N) {
                    if(arr[index] != null) {
                        node.right = new TreeNode(arr[index]);
                        nextRoots.add(node.right);
                    }
                    index++;
                }
            }
            nodes.clear();
            nodes.addAll(nextRoots);
        }

        return root;
    }

}
