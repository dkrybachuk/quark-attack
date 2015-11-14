/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.one.the.beginning;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class FunctionalProgrammingTest {
    
    public FunctionalProgrammingTest() {
    }
    
    @Before
    public void setUp() {
    }

  @Test
  public void testJohnSmith() throws Exception {
    Student jSmith = new Student("John", "Smith", "js123");
    //assertTrue("John Smith with student number js123 did not return true", FunctionalProgramming.f.apply(jSmith));
  }
}
