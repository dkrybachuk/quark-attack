/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.quick.find;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author dk
 */
public class QuickFindUFTest {

    @Test
    public void testConnectedAndUnion() {
        QuickFindUF q = new QuickFindUF(10);
        assertFalse(q.connected(3, 7));
        q.union(3, 7);
        assertTrue(q.connected(3, 7));

    }

    @Test
    public void testLenght() {
        assertEquals(10, new QuickFindUF(10).length());
    }

}
