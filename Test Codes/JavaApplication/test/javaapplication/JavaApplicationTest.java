/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class JavaApplicationTest {
    
    public JavaApplicationTest() {
    }

    /**
     * Test of repeatLetters method, of class JavaApplication.
     */
    @Test
    public void testRepeatLetters1() {
        System.out.println("repeatLetters");
        String strIn = "hello";
        String expResult = "heelllllllooooo";
        String result = JavaApplication.repeatLetters(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatLetters method, of class JavaApplication.
     */
    @Test
    public void testRepeatLetters2() {
        System.out.println("repeatLetters");
        String strIn = "what";
        String expResult = "whhaaatttt";
        String result = JavaApplication.repeatLetters(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatLetters method, of class JavaApplication.
     */
    @Test
    public void testRepeatLetters3() {
        System.out.println("repeatLetters");
        String strIn = "how are you";
        String expResult = "hoowww    aaaaarrrrrreeeeeee        yyyyyyyyyoooooooooouuuuuuuuuuu";
        String result = JavaApplication.repeatLetters(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatLetters method, of class JavaApplication.
     */
    @Test
    public void testRepeatLetters4() {
        System.out.println("repeatLetters");
        String strIn = "";
        String expResult = "";
        String result = JavaApplication.repeatLetters(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatLetters method, of class JavaApplication.
     */
    @Test
    public void testRepeatLetters5() {
        System.out.println("repeatLetters");
        String strIn = null;
        String expResult = null;
        String result = JavaApplication.repeatLetters(strIn);
        assertEquals(expResult, result);
    }
}
