/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.s.kids.number.shes.a.small.wonder;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author dk
 */
public class RobotTest {

    private Robot vicky;

    public RobotTest() {
    }

    @Before
    public void setUp() {
        vicky = new Robot();
    }

    @After
    public void tearDown() {
        vicky = null;
    }

    @Test
    public void simpleTest() {
        assertEquals("Thank you for teaching me hello", vicky.learnWord("hello"));
        assertEquals("Thank you for teaching me world", vicky.learnWord("world"));
        assertEquals("Thank you for teaching me goodbye", vicky.learnWord("goodbye"));
        assertEquals("I already know the word world", vicky.learnWord("world"));
        assertEquals("I already know the word World", vicky.learnWord("World"));
    }

}
