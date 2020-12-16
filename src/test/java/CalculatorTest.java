import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{

    @Test
    public void testAddition(){

        Addition a = new Addition(1,2);

        assertEquals(3,a.calculate());

    }

}