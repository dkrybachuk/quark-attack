/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.valid.braces;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author dk
 */
public class BraceCheckerTest {

    private BraceChecker checker;

    public BraceCheckerTest() {
    }

    @Before
    public void setUp() throws Exception {
        checker = new BraceChecker();
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }
}
