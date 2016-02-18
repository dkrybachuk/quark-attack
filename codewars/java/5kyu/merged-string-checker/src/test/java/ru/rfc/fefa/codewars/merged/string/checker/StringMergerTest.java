/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.merged.string.checker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class StringMergerTest {

    public StringMergerTest() {
    }

    @Test(timeout = (1 * 60000))
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }

    @Test(timeout = (10 * 60000))
    public void test1() {
        assertTrue("'iAuIk.6+.d3b)M7O#hYi(\\ H' is a merge of 'iIk.bMY ' and 'Au.6+d3)7O#hi(\\H'",
                StringMerger.isMerge("iAuIk.6+.d3b)M7O#hYi(\\ H", "iIk.bMY ", "Au.6+d3)7O#hi(\\H"));
    }

    @Test(timeout = (1 * 60000))
    public void testempty() {
        assertTrue("all empty",
                StringMerger.isMerge("", "", ""));
    }

    @Test(timeout = (1 * 60000))
    public void testBananas() {
        assertTrue("Going bananas", StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }
    
    @Test(timeout = (1 * 60000))
    public void testBananana() {
        assertTrue("bananabanana", StringMerger.chk("banana", "banana"));
        assertTrue("bananabanana", StringMerger.chk("bana", "banana"));
        //assertTrue("bananabanana", StringMerger.chk("banana", "bana"));
    }
 
    @Test(timeout =  (3 * 60000))
    public void myP() {
        StringMerger.p("banana______", 6);
    }
    
}
