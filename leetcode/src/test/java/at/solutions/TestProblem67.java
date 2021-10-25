package at.solutions;

import at.solutions.Problem67;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem67 {

    private Problem67 problem67 = new Problem67();

    @Test
    public void  testGivenExample1() {
        String a = "11", b = "1";
        String expected = "100";
        Assertions.assertEquals(expected, problem67.addBinary(a,b));
    }

    @Test
    public void  testGivenExample2() {
        String a = "1010", b = "1011";
        String expected = "10101";
        Assertions.assertEquals(expected, problem67.addBinary(a,b));
    }

    @Test
    public void  testAllZeros() {
        String a = "0000", b = "00";
        String expected = "0000";
        Assertions.assertEquals(expected, problem67.addBinary(a,b));
    }

    @Test
    public void  testAllOnes() {
        String a = "1111", b = "1111";
        String expected = "11110";
        Assertions.assertEquals(expected, problem67.addBinary(a,b));
    }

}
