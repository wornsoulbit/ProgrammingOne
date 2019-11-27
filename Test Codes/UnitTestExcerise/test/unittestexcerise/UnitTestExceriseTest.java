
package unittestexcerise;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class UnitTestExceriseTest {
    
    public UnitTestExceriseTest() {
    }

    /**
     * Test of factorial method, of class UnitTestExcerise.
     */
    @Test
    public void testFactorial1() {
        System.out.println("factorial");
        int num = 3;
        int expResult = 6;
        int result = UnitTestExcerise.factorial(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of factorial method, of class UnitTestExcerise.
     */
    @Test
    public void testFactorial2() {
        System.out.println("factorial");
        int num = 5;
        int expResult = 120;
        int result = UnitTestExcerise.factorial(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of factorial method, of class UnitTestExcerise.
     */
    @Test
    public void testFactorial3() {
        System.out.println("factorial");
        int num = 0;
        int expResult = 1;
        int result = UnitTestExcerise.factorial(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class UnitTestExcerise.
     */
    @Test
    public void testReverseString1() {
        System.out.println("reverseString");
        String strIn = "hello";
        String expResult = "olleh";
        String result = UnitTestExcerise.reverseString(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class UnitTestExcerise.
     */
    @Test
    public void testReverseString2() {
        System.out.println("reverseString");
        String strIn = "how are you!";
        String expResult = "!uoy era woh";
        String result = UnitTestExcerise.reverseString(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class UnitTestExcerise.
     */
    @Test
    public void testReverseString3() {
        System.out.println("reverseString");
        String strIn = "123456";
        String expResult = "654321";
        String result = UnitTestExcerise.reverseString(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class UnitTestExcerise.
     */
    @Test
    public void testReverseString4() {
        System.out.println("reverseString");
        String strIn = "";
        String expResult = "";
        String result = UnitTestExcerise.reverseString(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of reverseString method, of class UnitTestExcerise.
     */
    @Test
    public void testReverseString5() {
        System.out.println("reverseString");
        String strIn = null;
        String expResult = null;
        String result = UnitTestExcerise.reverseString(strIn);
        assertEquals(expResult, result);
    }
    
}
