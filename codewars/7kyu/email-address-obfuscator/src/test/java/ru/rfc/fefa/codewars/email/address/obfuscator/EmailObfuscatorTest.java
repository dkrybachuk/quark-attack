/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.email.address.obfuscator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class EmailObfuscatorTest {

    public EmailObfuscatorTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of obfuscate method, of class EmailObfuscator.
     */
    @Test
    public void test1() {
        assertEquals("test [at] 123 [dot] com",
                EmailObfuscator.obfuscate("test@123.com"));
    }

    @Test
    public void test2() {
        assertEquals("Code_warrior [at] foo [dot] ac [dot] uk",
                EmailObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
    }

}
