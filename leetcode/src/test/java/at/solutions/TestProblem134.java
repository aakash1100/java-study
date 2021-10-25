package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem134 {

    private Problem134 problem134 = new Problem134();

    @Test
    public void  testGivenExample1() {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        int expected = 3;
        Assertions.assertEquals(expected, problem134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void  testGivenExample2() {
        int[] gas = {2,3,4}, cost = {3,4,3};
        int expected = -1;
        Assertions.assertEquals(expected, problem134.canCompleteCircuit(gas, cost));
    }
}
