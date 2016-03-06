/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.deodorant.evaporator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class EvaporatorTest {

    @Test
    public void testEvaporatorOne() {
        assertEquals(22, Evaporator.evaporator(10, 10, 10));
    }

}
