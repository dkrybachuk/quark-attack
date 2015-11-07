/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.ease.the.stockbroker;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class OrdersSummaryTest {

    public OrdersSummaryTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of balanceStatements method, of class OrdersSummary.
     */
    @Test
    public void test0() {
        String l = "ZNGA 1300 2.66 B";
        assertEquals("Buy: 3458 Sell: 0",
                OrdersSummary.balanceStatements(l));
    }

    /**
     * Test of balanceStatements method, of class OrdersSummary.
     */
    @Test
    public void test1() {
        String l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B";
        assertEquals("Buy: 29499 Sell: 0",
                OrdersSummary.balanceStatements(l));
    }

    /**
     * Test of balanceStatements method, of class OrdersSummary.
     */
    @Test
    public void test6() {
        String l = "CAP 1300 .2 B, CLH16.NYM 50 56 S, OWW 1000 11 S, OGG 20 580.1 S";
        assertEquals("Buy: 260 Sell: 11602; Badly formed 2: CLH16.NYM 50 56 S ;OWW 1000 11 S ;",
                OrdersSummary.balanceStatements(l));
    }

    /**
     * Test of balanceStatements method, of class OrdersSummary.
     */
    @Test
    public void test7() {
        String l = "";
        assertEquals("Buy: 0 Sell: 0",
                OrdersSummary.balanceStatements(l));
    }
}
