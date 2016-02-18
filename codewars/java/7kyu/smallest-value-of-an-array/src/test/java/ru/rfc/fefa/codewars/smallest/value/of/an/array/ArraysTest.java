/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.smallest.value.of.an.array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class ArraysTest {

    public ArraysTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSample() {
        assertEquals("The smallest index", 0, Arrays.findSmallest(new int[]{1, 2, 3}, "index"));
        assertEquals("The smallest value", 2, Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"));
        assertEquals("The smallest index", 3, Arrays.findSmallest(new int[]{7, 12, 3, 2, 27}, "index"));
    }
}
