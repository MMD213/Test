import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalcTest {
    @Test
    public void testPlus(){
        Calc calc = new Calc(2,4);
        assertEquals(6,calc.plus(2,4));
    }

    @Test
    public  void  testMinus() {
        Calc calc = new Calc(2,4);
        assertEquals(-2,calc.minus(2,4));
    }

    @Test
    public void testUmn() {
        Calc calc = new Calc(2,4);
        assertEquals(8,calc.umn(2,4));
    }

    @Test
    public void testDel() {
        Calc calc = new Calc(2,2);
        assertEquals(1,calc.del(2,2));
    }

    @Test
    public void testPcvadrat() {
        Calc calc = new Calc(2,2);
        assertEquals(8,calc.Pcvadrat(2,2));
    }
}