package at.solutions;

import at.solutions.Problem677;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblem677 {

    private Problem677 problem677 = new Problem677();

    @Test
    public void  testGivenExample1() {
        Problem677.MapSum mapSum = new Problem677.MapSum();
        mapSum.insert("apple", 3);
        mapSum.sum("ap");           // return 3 (apple = 3)
        mapSum.insert("app", 2);
        Assertions.assertEquals(5, mapSum.sum("ap"));
    }

}
