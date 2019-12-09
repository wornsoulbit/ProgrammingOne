/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removemostfrequentchar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class RemoveMostFrequentCharTest {
    
    public RemoveMostFrequentCharTest() {
    }

    /**
     * Test of removeMostFrequentChar method, of class RemoveMostFrequentChar.
     */
    @Test
    public void testRemoveMostFrequentChar1() {
        System.out.println("removeMostFrequentChar");
        String strIn = "";
        String expResult = "";
        String result = RemoveMostFrequentChar.removeMostFrequentChar(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeMostFrequentChar method, of class RemoveMostFrequentChar.
     */
    @Test
    public void testRemoveMostFrequentChar2() {
        System.out.println("removeMostFrequentChar");
        String strIn = null;
        String expResult = null;
        String result = RemoveMostFrequentChar.removeMostFrequentChar(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeMostFrequentChar method, of class RemoveMostFrequentChar.
     */
    @Test
    public void testRemoveMostFrequentChar3() {
        System.out.println("removeMostFrequentChar");
        String strIn = "hey hey";
        String expResult = "ey ey";
        String result = RemoveMostFrequentChar.removeMostFrequentChar(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeMostFrequentChar method, of class RemoveMostFrequentChar.
     */
    @Test
    public void testRemoveMostFrequentChar4() {
        System.out.println("removeMostFrequentChar");
        String strIn = "Hello";
        String expResult = "Heo";
        String result = RemoveMostFrequentChar.removeMostFrequentChar(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of removeMostFrequentChar method, of class RemoveMostFrequentChar.
     */
    @Test
    public void testRemoveMostFrequentChar() {
        System.out.println("removeMostFrequentChar");
        String strIn = "Mississipi";
        String expResult = "Mssssp";
        String result = RemoveMostFrequentChar.removeMostFrequentChar(strIn);
        assertEquals(expResult, result);
    }
    
}
