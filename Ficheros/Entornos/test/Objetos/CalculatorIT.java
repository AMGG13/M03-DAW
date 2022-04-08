/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Objetos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class CalculatorIT {
    
    public CalculatorIT() {
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
     * Test of suma method, of class Calculator.
     */
    @Test
    public void testSumaPar() {
        System.out.println("suma");
        int n1 = 4;
        int n2 = 4;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.suma(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of resta method, of class Calculator.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int n1 = 10;
        int n2 = 5;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.resta(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multi method, of class Calculator.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        int n1 = 3;
        int n2 = 4;
        Calculator instance = new Calculator();
        int expResult = 1;
        int result = instance.multi(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int n1 = 7;
        int n2 = 0;
        Calculator instance = new Calculator();
        double expResult = 5.0;
        double result = instance.divide(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
