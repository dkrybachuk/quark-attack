/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.which.are.in;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class WhichAreInTest {

    public WhichAreInTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of inArray method, of class WhichAreIn.
     */
    @Test
    public void test1() {
        String a[] = new String[]{"arp", "live", "strong"};
        String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String r[] = new String[]{"arp", "live", "strong"};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}
