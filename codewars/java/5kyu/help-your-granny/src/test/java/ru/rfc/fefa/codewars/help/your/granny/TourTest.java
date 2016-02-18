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
        String[] friends1 = new String[]{"A1", "A2", "A3", "A4", "A5", "A6"};
        String[][] fTowns1 = {new String[]{"A1", "X1"}, new String[]{"A2", "X2"}, new String[]{"A3", "X3"},
        new String[]{"A4", "X3"}, new String[]{"A5", "X3"}, new String[]{"A6", "X4"}};
        Map<String, Double> distTable1 = new HashMap<>();
        distTable1.put("X1", 100.0);
        distTable1.put("X2", 200.0);
        distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        assertEquals(889, Tour.tour(friends1, fTowns1, distTable1));
    }

    @Test
    public void test3() {
        String[] friends1 = new String[]{"B1", "B2"};
        String[][] fTowns1 = {new String[]{"B1", "Y1"}, new String[]{"B2", "Y2"}, new String[]{"B3", "Y3"},
        new String[]{"B4", "Y4"}, new String[]{"B5", "Y5"}};
        Map<String, Double> distTable1 = new HashMap<>();
        distTable1.put("Y1", 50.0);
        distTable1.put("Y2", 70.0);
        distTable1.put("Y3", 90.0);
        distTable1.put("Y4", 110.0);
        distTable1.put("Y5", 150.0);
        assertEquals(168, Tour.tour(friends1, fTowns1, distTable1));
    }

    @Test
    public void test8() {
        String[] friends1 = new String[]{"B1", "B2", "B4", "B5"};
        String[][] fTowns1 = {new String[]{"B1", "Y1"}, new String[]{"B2", "Y2"}, new String[]{"B3", "Y3"},
        new String[]{"B4", "Y4"}, new String[]{"B5", "Y5"}};
        Map<String, Double> distTable1 = new HashMap<>();
        distTable1.put("Y1", 60.0);
        distTable1.put("Y2", 80.0);
        distTable1.put("Y3", 100.0);
        distTable1.put("Y4", 110.0);
        distTable1.put("Y5", 150.0);
        assertEquals(440, Tour.tour(friends1, fTowns1, distTable1));
    }

}
