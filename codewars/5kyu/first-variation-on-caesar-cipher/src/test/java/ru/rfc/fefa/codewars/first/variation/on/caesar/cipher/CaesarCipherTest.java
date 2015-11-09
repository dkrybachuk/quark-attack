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

    /**
     * Test of movingShift method, of class CaesarCipher.
     */
    @Test
    public void testd() {
        String u = "abcdefghjuty";
        List<String> v = Arrays.asList("bdf", "hjl", "nps", "eek", "");
        assertEquals(v, CaesarCipher.movingShift(u, 27));
        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 27), 27));
    }

    @Test
    public void testa() {
        String u = " tnwHhqlnudMqddebjfhdznhDbnnpn";
        List<String> v = Arrays.asList(" xscOp", "zvygqA", "ftuwud", "adaxmh", "Edqrut");
        System.out.println(CaesarCipher.demovingShift(v, 3));
        assertEquals(v, CaesarCipher.movingShift(u, 3));
        assertEquals(u, CaesarCipher.demovingShift(CaesarCipher.movingShift(u, 3), 3));
    }
}
