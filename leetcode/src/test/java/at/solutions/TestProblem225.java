package at.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem225 {

    private Problem225 problem225 = new Problem225();

    @Test
    public void  testGivenExample1() {
        Problem225.MyStack stack = new Problem225.MyStack();
        Assertions.assertTrue(stack.empty());
        stack.push(1);
        Assertions.assertFalse(stack.empty());
        Assertions.assertEquals(1, stack.top());
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.top());
        Assertions.assertFalse(stack.empty());
    }


}
