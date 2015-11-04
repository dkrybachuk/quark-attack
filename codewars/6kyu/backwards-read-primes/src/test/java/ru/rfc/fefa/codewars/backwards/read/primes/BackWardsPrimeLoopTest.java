/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.backwards.read.primes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class BackWardsPrimeLoopTest {

    public BackWardsPrimeLoopTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of backwardsPrime method, of class BackWardsPrime.
     */
    @Test
    public void backWardsPrime13() {
        assertEquals("13 17 31 37 71 73 79 97", BackWardsPrimeLoop.backwardsPrime(1, 100));
    }

    @Test
    public void backWardsPrime21() {
        assertEquals("9923 9931 9941 9967", BackWardsPrimeLoop.backwardsPrime(9900, 10000));
    }

    @Test(timeout = 10000L)
    public void backWardsPrime3() {
        assertEquals("70489 70529 70573 70589", BackWardsPrimeLoop.backwardsPrime(70489, 70590));
    }

    @Test(timeout = 10000L)
    public void backWardsPrime4() {
        assertEquals("", BackWardsPrimeLoop.backwardsPrime(10, 1));
    }
}
