package at.solutions;

import at.common.p429.Node;
import at.util.LeetCodeTestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestProblem429 {

    private Problem429 problem429 = new Problem429();

    @Test
    public void  testGivenExample1() {
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{{1},{3,2,4},{5,6}});
        Node node = LeetCodeTestUtils.naryTree(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
        Assertions.assertEquals(expected, problem429.levelOrder(node));
    }

    @Test
    public void  testGivenExample2() {
        List<List<Integer>> expected = LeetCodeTestUtils.twoDArrayToListOfList(new Integer[][]{{1},{2,3,4,5},{6,7,8,9,10},{11,12,13},{14}});
        Node node = LeetCodeTestUtils.naryTree(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
        Assertions.assertEquals(expected, problem429.levelOrder(node));
    }


}
