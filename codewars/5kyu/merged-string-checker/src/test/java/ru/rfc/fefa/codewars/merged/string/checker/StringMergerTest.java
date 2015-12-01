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
    
  @Test(timeout = (10 * 60000))
  public void normalHappyFlow() {
    assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
    assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
  }
    
}
