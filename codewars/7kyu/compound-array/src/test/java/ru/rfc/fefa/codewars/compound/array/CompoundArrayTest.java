/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.compound.array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class CompoundArrayTest {

    public CompoundArrayTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 9, 2, 8, 3, 7, 4, 6, 5, 6}, CompoundArray.compoundArray(new int[]{1, 2, 3, 4, 5, 6}, new int[]{9, 8, 7, 6}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 9, 1, 8, 2, 7, 6, 5, 4, 3, 2, 1, 0}, CompoundArray.compoundArray(new int[]{0, 1, 2}, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }

}
