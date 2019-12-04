/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatvowels;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class RepeatVowelsTest {
    
    public RepeatVowelsTest() {
    }

    /**
     * Test of repeatVowels method, of class RepeatVowels.
     */
    @Test
    public void testRepeatVowels1() {
        System.out.println("repeatVowels");
        String strIn = "HEllo";
        String expResult = "HEElloo";
        String result = RepeatVowels.repeatVowels(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatVowels method, of class RepeatVowels.
     */
    @Test
    public void testRepeatVowels2() {
        System.out.println("repeatVowels");
        String strIn = "you are there!";
        String expResult = "yoouu aaree theeree!";
        String result = RepeatVowels.repeatVowels(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatVowels method, of class RepeatVowels.
     */
    @Test
    public void testRepeatVowels3() {
        System.out.println("repeatVowels");
        String strIn = "Yi is awesome";
        String expResult = "Yii iis aaweesoomee";
        String result = RepeatVowels.repeatVowels(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatVowels method, of class RepeatVowels.
     */
    @Test
    public void testRepeatVowels4() {
        System.out.println("repeatVowels");
        String strIn = "";
        String expResult = "";
        String result = RepeatVowels.repeatVowels(strIn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of repeatVowels method, of class RepeatVowels.
     */
    @Test
    public void testRepeatVowels5() {
        System.out.println("repeatVowels");
        String strIn = null;
        String expResult = null;
        String result = RepeatVowels.repeatVowels(strIn);
        assertEquals(expResult, result);
    }
    
}
