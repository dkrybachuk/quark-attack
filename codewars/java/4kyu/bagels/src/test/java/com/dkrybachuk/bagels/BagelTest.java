/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.bagels;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class BagelTest {

    @Test
    public void testBagel() {
        
        Bagel bagel = BagelSolver.getBagel();
        
        assertEquals(
            bagel.getValue() == 4,
            java.lang.Boolean.TRUE
        );
    }

}
