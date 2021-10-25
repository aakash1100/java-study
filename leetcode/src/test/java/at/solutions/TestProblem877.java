package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem877 {

    private Problem877 problem877 = new Problem877();

    @Test
    public void testGivenExample1() {
        int[] piles = {5,3,4,5};
        Assertions.assertTrue(problem877.stoneGame(piles));
    }

    @Test
    public void testFailed1() {
        int[] piles = {3,2,10,4};
        Assertions.assertTrue(problem877.stoneGame(piles));
    }

    @Test
    public void testFailed2() {
        int[] piles = {7,7,12,16,41,48,41,48,11,9,34,2,44,30,27,12,11,39,31,8,23,11,47,25,15,23,4,17,11,50,16,50,38,34,48,27,16,24,22,48,50,10,26,27,9,43,13,42,46,24};
        Assertions.assertTrue(problem877.stoneGame(piles));
    }
}
