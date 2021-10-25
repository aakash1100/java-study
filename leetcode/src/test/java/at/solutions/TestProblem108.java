package at.solutions;

import at.common.TreeNode;
import at.solutions.Problem108;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestProblem108 {

    private Problem108 problem108 = new Problem108();

    @Test
    public void testGivenExample1() {
        int[] nums = {-10,-3,0,5,9};
        List<Integer> expected = Arrays.asList(0,-10,5,null,-3,null,9);
        TreeNode node = problem108.sortedArrayToBST(nums);
        Assertions.assertEquals(expected, node.toList());
    }

    @Test
    public void testGivenExample2() {
        int[] nums = {1, 3};
        List<Integer> expected = Arrays.asList(1, null, 3);
        TreeNode node = problem108.sortedArrayToBST(nums);
        Assertions.assertEquals(expected, node.toList());
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        List<Integer> expected = Arrays.asList(1);
        TreeNode node = problem108.sortedArrayToBST(nums);
        Assertions.assertEquals(expected, node.toList());
    }
}
