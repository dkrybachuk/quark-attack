/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.quick.find;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class QuickFindUFTest {
   
    @Test
    public void testConnectedAndUnion() {
        QuickFindUF q = new QuickFindUF(10);
        assertEquals(false, q.connected(3,7));
        q.union(3, 7);
        assertEquals(true, q.connected(3,7));
        
    }
    
    @Test
    public void testLenght() {
        assertEquals(10, new QuickFindUF(10).length());
    }
    
}
