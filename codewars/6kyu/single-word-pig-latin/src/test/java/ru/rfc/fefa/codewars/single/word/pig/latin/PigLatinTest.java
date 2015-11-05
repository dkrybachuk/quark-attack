/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.single.word.pig.latin;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class PigLatinTest {

    private PigLatin p;

    public PigLatinTest() {
    }

    @Before
    public void setUp() {
        p = new PigLatin();
    }

    @Test
    public void testMap() {
        assertEquals("apmay", p.translate("map"));
    }

    @Test
    public void testegg() {
        assertEquals("eggway", p.translate("egg"));
    }

    @Test
    public void testspaghetti() {
        assertEquals("aghettispay", p.translate("spaghetti"));
    }

}
