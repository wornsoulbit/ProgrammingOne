/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberchecker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class PrimeNumberCheckerTest {
    
    public PrimeNumberCheckerTest() {
    }

    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime1() {
        System.out.println("isPrime");
        int num = 0;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        int num = 1;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime3() {
        System.out.println("isPrime");
        int num = 3;
        boolean expResult = true;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime4() {
        System.out.println("isPrime");
        int num = 97;
        boolean expResult = true;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime5() {
        System.out.println("isPrime");
        int num = 98;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime6() {
        System.out.println("isPrime");
        int num = 13;
        boolean expResult = true;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime7() {
        System.out.println("isPrime");
        int num = 8;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class PrimeNumberChecker.
     */
    @Test
    public void testIsPrime8() {
        System.out.println("isPrime");
        int num = 32;
        boolean expResult = false;
        boolean result = PrimeNumberChecker.isPrime(num);
        assertEquals(expResult, result);
    }
}
