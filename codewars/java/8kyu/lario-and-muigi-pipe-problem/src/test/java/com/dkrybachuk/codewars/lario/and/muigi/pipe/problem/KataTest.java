/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.lario.and.muigi.pipe.problem;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 *
 * @author ribachuk
 */
public class KataTest {

    @Test
    public void tests() {

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, Kata.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, Kata.pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(new int[]{6, 7, 8, 9}, Kata.pipeFix(new int[]{6, 9}));
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, Kata.pipeFix(new int[]{-1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, Kata.pipeFix(new int[]{1, 2, 3}));
    }

}
