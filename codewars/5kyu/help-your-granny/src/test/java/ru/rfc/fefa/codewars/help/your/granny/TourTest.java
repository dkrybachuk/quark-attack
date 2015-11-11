/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.help.your.granny;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class TourTest {

    public TourTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        String[] friends1 = new String[]{"A1", "A2", "A3", "A4", "A5"};
        String[][] fTowns1 = {new String[]{"A1", "X1"}, new String[]{"A2", "X2"}, new String[]{"A3", "X3"},
        new String[]{"A4", "X4"}};
        Map<String, Double> distTable1 = new HashMap<>();
        distTable1.put("X1", 100.0);
        distTable1.put("X2", 200.0);
        distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        assertEquals(889, Tour.tour(friends1, fTowns1, distTable1));
    }

}
