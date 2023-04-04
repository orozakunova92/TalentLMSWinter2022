package testng;

import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.*;

public class CalculatorTest {

    SoftAssert softassert = new SoftAssert();
    @Test
    public void addTwoNumsTest() {
        assertEquals(Calculator.add(2,2),4);
        assertEquals(Calculator.add(2,2),3);
        assertEquals(Calculator.add(2,2),5);
        assertEquals(Calculator.add(2,3),5);
        System.out.println("3");
        assertEquals(Calculator.add(2,3),5);
        System.out.println("4");
        assertEquals(Calculator.add(2,3),5);
        System.out.println("15");

    }
    @Test
    public void testSoftAssert(){
        softassert.assertEquals(Calculator.add(2,2),4);
        softassert.assertEquals(Calculator.add(2,2),5);
        softassert.assertEquals(Calculator.add(2,2),6);

        softassert.assertEquals(Calculator.add(2,2),7);

        softassert.assertEquals(Calculator.add(2,2),8);

        softassert.assertAll();

    }

    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);

    }
    @Test
    public void test123(){

        Object obj = new Object();
        obj = null;

        assertNotNull(obj);



    }


}
