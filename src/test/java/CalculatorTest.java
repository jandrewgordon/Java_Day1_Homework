import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(6, calculator.add(4,2));
    }

    @Test
    public void canSubtracted() {
        assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void canMultiply() {
        assertEquals(8, calculator.multiply(4,2));
    }

    @Test
    public void canDivide() {
        assertEquals(2.00,calculator.divide(4.00,2.00), 0.0);
    }


}
