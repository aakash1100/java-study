package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import at.util.LeetCodeTestUtils;

import java.util.List;

public class TestProblem113 {

    private Problem113 problem113 = new Problem113();

    @Test
    public void testGivenExample1() {
        Integer[] nums = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        int targetSum = 22;
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{{5,4,11,2}, {5,8,4,5}});
       Assertions.assertEquals(expected, problem113.pathSum(LeetCodeTestUtils.toTreeNode(nums), targetSum));
    }

    @Test
    public void testGivenExample2() {
        Integer[] nums = {1,2,3};
        int targetSum = 5;
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{});
        Assertions.assertEquals(expected, problem113.pathSum(LeetCodeTestUtils.toTreeNode(nums), targetSum));
    }

    @Test
    public void testGivenExample3() {
        Integer[] nums = {1,2};
        int targetSum = 0;
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{});
        Assertions.assertEquals(expected, problem113.pathSum(LeetCodeTestUtils.toTreeNode(nums), targetSum));
    }
}
