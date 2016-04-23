/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.total.increasing.or.decreasing.numbers.up.to.a.power.of.ten;

import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author dk
 */
public class Problem113Test {

    private static final int timeout = 0;

    public Problem113Test() {
    }

    @Test(timeout = timeout)
    public void testTotalIncDec0() {
        assertEquals(BigInteger.valueOf(1), Problem113.totalIncDec(0));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec1() {
        assertEquals(BigInteger.valueOf(10), Problem113.totalIncDec(1));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec2() {
        assertEquals(BigInteger.valueOf(100), Problem113.totalIncDec(2));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec3() {
        assertEquals(BigInteger.valueOf(475), Problem113.totalIncDec(3));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec4() {
        assertEquals(BigInteger.valueOf(1675), Problem113.totalIncDec(4));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec5() {
        assertEquals(BigInteger.valueOf(4954), Problem113.totalIncDec(5));
    }

    @Test(timeout = timeout)
    public void testTotalIncDec6() {
        assertEquals(BigInteger.valueOf(12952), Problem113.totalIncDec(6));
    }

}
