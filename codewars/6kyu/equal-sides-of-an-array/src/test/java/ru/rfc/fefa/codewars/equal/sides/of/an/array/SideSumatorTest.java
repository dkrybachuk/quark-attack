/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.equal.sides.of.an.array;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class SideSumatorTest {
    
    public SideSumatorTest() {
    }

    /**
     * Test of findEvenIndex method, of class Kata.
     */
    @Test
    public void testSum() {
        assertEquals(1, Kata.findEvenIndex(new int[]{1,100,50,-51,1,1}));
    }
    
    @Test
    public void testSum2() {
        assertEquals(3, Kata.findEvenIndex(new int[]{1,2,3,4,3,2,1}));
    }
    
}
