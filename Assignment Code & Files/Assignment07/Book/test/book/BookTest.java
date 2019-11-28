/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstuser
 */
public class BookTest {
    
    public BookTest() {
    }

    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus1() {
        System.out.println("checkIsbnStatus");
        String isbn = "1-11-111111-1";
        Book instance = new Book();
        int expResult = 0;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus2() {
        System.out.println("checkIsbnStatus");
        String isbn = "1-1-1111111-1";
        Book instance = new Book();
        int expResult = -1;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus3() {
        System.out.println("checkIsbnStatus");
        String isbn = "978-1-11-111111-1";
        Book instance = new Book();
        int expResult = 1;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus4() {
        System.out.println("checkIsbnStatus");
        String isbn = "978-1-1-1111111-1";
        Book instance = new Book();
        int expResult = -1;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus5() {
        System.out.println("checkIsbnStatus");
        String isbn = "978-1-1111111-1-1";
        Book instance = new Book();
        int expResult = 1;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkIsbnStatus method, of class Book.
     */
    @Test
    public void testCheckIsbnStatus6() {
        System.out.println("checkIsbnStatus");
        String isbn = "1-1111111-1-1";
        Book instance = new Book();
        int expResult = 0;
        int result = instance.checkIsbnStatus(isbn);
        assertEquals(expResult, result);
    }
}
