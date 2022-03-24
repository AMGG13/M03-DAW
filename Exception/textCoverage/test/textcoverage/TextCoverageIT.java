/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textcoverage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class TextCoverageIT {
    
    public TextCoverageIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class TextCoverage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TextCoverage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funcio method, of class TextCoverage.
     */
    @Test
    public void testFuncio() {
        System.out.println("funcio");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        TextCoverage instance = new TextCoverage();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
