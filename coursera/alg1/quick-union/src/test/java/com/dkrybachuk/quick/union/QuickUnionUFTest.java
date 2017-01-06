/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.quick.union;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class QuickUnionUFTest {

    @Test
    public void testConnected() {
        QuickUnionUF q = new QuickUnionUF(10);
        assertFalse(q.connected(3, 7));
        q.union(3, 7);
        assertTrue(q.connected(3, 7));
    }

    @Test
    public void testLength() {
        assertEquals(10, new QuickUnionUF(10).length());
    }

}
