/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knexus.prefixsum;

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
public class rangeTest {
    
    public rangeTest() {
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
     * Test of main method, of class App.
     */
   

    /**
     * Test of sumRange method, of class App.
     */
    @Test
    public void testSumRange() {
        System.out.println("sumRange");
        int[] prefix_arr = {0,2,5,10,11};
        int range_l = 1;
        int range_r = 4;
        int expResult = 9;
        int result = App.sumRange(prefix_arr, range_l, range_r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
