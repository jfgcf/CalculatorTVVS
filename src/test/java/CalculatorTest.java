import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{
    private static final double ERROR_MARGIN = 0.001;
    @Test
    public void testAddition(){

        Addition a = new Addition(1,2);

        assertEquals(3,a.calculate(),ERROR_MARGIN);

    }

    @Test
    public void testSubtraction(){

        Subtraction a = new Subtraction(1,2);

        assertEquals(-1,a.calculate(),ERROR_MARGIN);

    }

    @Test
    public void testMultiplication(){
        Multiplication m = new Multiplication(512,2);
        assertEquals(1024,m.calculate(),ERROR_MARGIN);

    }

    @Test
    public void testDivisionbyZero(){

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Division d = new Division(1,0);
            d.calculate();
        });
        assertEquals("Divide by zero error",exception.getMessage());
    }

    @Test
    public void testDivideZerobyNumber(){
        Division d = new Division(0,1);
        assertEquals(0,d.calculate(),ERROR_MARGIN);
    }

    @Test
    public void testFractionDivision(){
        Division d = new Division(-1,2);
        assertEquals(0.5,d.calculate(),ERROR_MARGIN);
    }

    @Test
    public void testDivisionNegativeDenominator(){
        Division d = new Division(6,-2);
        assertEquals(-3,d.calculate(),ERROR_MARGIN);
    }

    @Test
    public void testDivisionNegativeNumerator(){
        Division d = new Division(-6,2);
        assertEquals(-3,d.calculate(),ERROR_MARGIN);
    }
}