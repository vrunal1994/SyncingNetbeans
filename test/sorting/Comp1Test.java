/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vmhatre
 */
public class Comp1Test {
    
    public Comp1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compare method, of class Comp1.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        String string1 = "hello";
        String string2 = "Hello";
        Comp1 instance = new Comp1();
        int expResult = string1.compareToIgnoreCase(string2);
        int result = instance.compare(string1, string2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
