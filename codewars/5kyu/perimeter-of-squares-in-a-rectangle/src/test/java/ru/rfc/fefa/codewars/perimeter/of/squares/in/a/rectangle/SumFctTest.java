/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.perimeter.of.squares.in.a.rectangle;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class SumFctTest {

    public SumFctTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
    }

    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
    }

    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
    }

}
