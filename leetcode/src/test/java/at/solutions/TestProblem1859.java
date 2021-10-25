package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem1859 {

    private Problem1859 problem1859 = new Problem1859();

    @Test
    public void  testGivenExample1() {
        String input = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        Assertions.assertEquals(expected, problem1859.sortSentence(input));
    }

    @Test
    public void  testGivenExample2() {
        String input = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        Assertions.assertEquals(expected, problem1859.sortSentence(input));
    }

}
