/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package empleados;

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
public class EmployeesTest {
    
    public EmployeesTest() {
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
     * Test of addEmployee method, of class Employees.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        String name = "Javier";
        Employees instance = new Employees();
        boolean expResult = true;
        boolean result = instance.addEmployee(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeEmployee method, of class Employees.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("removeEmployee");
        int posicion = 0;
        Employees instance = new Employees();
        boolean expResult = false;
        boolean result = instance.removeEmployee(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class Employees.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        int posicion = 0;
        String newName = "";
        Employees instance = new Employees();
        boolean expResult = false;
        boolean result = instance.updateEmployee(posicion, newName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
