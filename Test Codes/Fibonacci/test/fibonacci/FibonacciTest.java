/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }

    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci1() {
        System.out.println("fibonacci");
        int num = 10;
        int expResult = 55;
        int result = Fibonacci.fibonacci(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci2() {
        System.out.println("fibonacci");
        int num = 7;
        int expResult = 13;
        int result = Fibonacci.fibonacci(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci3() {
        System.out.println("fibonacci");
        int num = 0;
        int expResult = 0;
        int result = Fibonacci.fibonacci(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci4() {
        System.out.println("fibonacci");
        int num = 1;
        int expResult = 1;
        int result = Fibonacci.fibonacci(num);
        assertEquals(expResult, result);
    }
    
}
