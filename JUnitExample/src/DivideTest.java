
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    public void denominatorEqualsZero(){

        Divide d = new Divide();
        //double actual = d.divide(2, 0);

        assertThrows(ArithmeticException.class, () -> {d.divide(2,0);});

        // (parameters) -> {statements;}

    }

    @Test
    public void iGreaterThanFiveTest(){
        Divide d = new Divide();
        String actual = d.message(6);
        assertEquals("Big", actual);
    }

}