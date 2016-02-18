/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.financing.plan.on.planet.xy140z.n;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class FinanceTest {

    public FinanceTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void test0() {
        assertEquals(BigInteger.valueOf(168), Finance.finance(6));
    }

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(105), Finance.finance(5));
    }

    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(168), Finance.finance(6));
    }

    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(360), Finance.finance(8));
    }

    @Test
    public void test4() {
        assertEquals(BigInteger.valueOf(2040), Finance.finance(15));
    }

}
