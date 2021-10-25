package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1417 {

    private Problem1417 problem1417 = new Problem1417();

    @Test
    public void  testGivenExample1() {
        String input = "a0b1c2";
        String expected = "0a1b2c";
        Assertions.assertEquals(expected, problem1417.reformat(input));
    }

    @Test
    public void  testGivenExample2() {
        String input = "leetcode";
        String expected = "";
        Assertions.assertEquals(expected, problem1417.reformat(input));
    }

    @Test
    public void  testGivenExample3() {
        String input = "1229857369";
        String expected = "";
        Assertions.assertEquals(expected, problem1417.reformat(input));
    }

    @Test
    public void  testGivenExample4() {
        String input = "covid2019";
        String expected = "c2o0v1i9d";
        Assertions.assertEquals(expected, problem1417.reformat(input));
    }

    @Test
    public void  testGivenExample5() {
        String input = "ab123";
        String expected = "1a2b3";
        Assertions.assertEquals(expected, problem1417.reformat(input));
    }

}
