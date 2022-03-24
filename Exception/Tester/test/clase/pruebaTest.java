/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class pruebaTest {
    
    public pruebaTest() {
    }

    @Test
    public void testFuncioA() {
        System.out.println("funcio");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        prueba instance = new prueba();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
    }

    public void testFuncioB() {
        System.out.println("funcio");
        int a = 3;
        int b = 0;
        int c = 1;
        int d = 0;
        prueba instance = new prueba();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
    }
    
    public void testFuncioC() {
        System.out.println("funcio");
        int a = 2;
        int b = 2;
        int c = 1;
        int d = 1;
        prueba instance = new prueba();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
    }

    public void testFuncioD() {
        System.out.println("funcio");
        int a = 2;
        int b = 0;
        int c = 1;
        int d = 1;
        prueba instance = new prueba();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
    }

    public void testFuncioE() {
        System.out.println("funcio");
        int a = 3;
        int b = 0;
        int c = 1;
        int d = 1;
        prueba instance = new prueba();
        int expResult = 0;
        int result = instance.funcio(a, b, c, d);
        assertEquals(expResult, result);
    }

    
}
