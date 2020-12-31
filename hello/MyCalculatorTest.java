package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalculatorTest {
    MyCalculator calculator = new MyCalculator();

    @Test
    public void add() {
        assertEquals(2, calculator.plus(1, 1));
    }
}