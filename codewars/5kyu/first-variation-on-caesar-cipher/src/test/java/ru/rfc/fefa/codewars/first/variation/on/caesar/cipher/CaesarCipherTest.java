/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.first.variation.on.caesar.cipher;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author dk
 */
public class CaesarCipherTest {

    public CaesarCipherTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of movingShift method, of class CaesarCipher.
     */
    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, CaesarCipher.movingShift(u, 1));
        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 1), 1));
    }

}
