/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.build.a.pile.of.cubes;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class ASumTest {

    public ASumTest() {
    }

    @Test
    public void test11() {
        assertEquals(55100, ASum.findNb(2304422822859502500L));
    }

    @Test
    public void test12() {
        assertEquals(-1, ASum.findNb(2304422822859502501L));
    }

    public static long solution(long m) {
        long limit = (long) (Math.sqrt(2) * Math.pow(m, 0.25) + 1);
        for (long i = 0; i <= limit; i++) {
            if (i * i * (i + 1) * (i + 1) / 4 == m) {
                return i;
            }
        }
        return (-1L);
    }

    public static void randTests() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            long r = 50000 + rnd.nextInt(5000);
            long k = r * r * (r + 1) * (r + 1) / 4 + rnd.nextInt(2);
            System.out.println("Find n of : " + k);
            //System.out.println(" n " + ASum.findNb(k));
            assertEquals(solution(k), ASum.findNb(k));
        }
    }

    @Test
    public void testA() {
        randTests();
    }
}
