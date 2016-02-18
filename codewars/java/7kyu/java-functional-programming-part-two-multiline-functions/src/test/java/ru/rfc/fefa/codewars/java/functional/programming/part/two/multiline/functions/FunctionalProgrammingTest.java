/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.two.multiline.functions;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class FunctionalProgrammingTest {

    public FunctionalProgrammingTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSomeMethod() {
        Triangle t = new Triangle(5, 10);
        assertEquals("Incorrect area returned", 25D, FunctionalProgramming.f.applyAsDouble(t), 0.001);
        assertEquals("Incorrect area in Triangle object", 25D, t.getArea(), 0.001);

    }

}
