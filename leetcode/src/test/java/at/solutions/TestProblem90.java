package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import at.util.LeetCodeTestUtils;

import java.util.List;

public class TestProblem90 {

    private Problem90 problem90 = new Problem90();

    @Test
    public void testGivenExample1() {
        int[] nums1 = {1,2,2};
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{{}, {1}, {1, 2}, {1, 2, 2}, {2}, {2, 2}});
       Assertions.assertEquals(expected, problem90.subsetsWithDup(nums1));
    }
}
