/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.binary.multiple.of.three;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dk
 */
public class BinaryRegexpTest {

    public BinaryRegexpTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void checkType() {
        // In fact Pattern and Matcher can't be extended as they are final, but let this be
        assertEquals(Pattern.class, BinaryRegexp.multipleOf3().getClass());
        assertEquals(Matcher.class, BinaryRegexp.multipleOf3().matcher("").getClass());
    }

    @Test
    public void testInvalid() {
        assertEquals(false, BinaryRegexp.multipleOf3().matcher(" 0").matches());
        assertEquals(false, BinaryRegexp.multipleOf3().matcher("abc").matches());
        assertEquals(false, BinaryRegexp.multipleOf3().matcher("011 110").matches());
    }

    @Test
    public void testValid() {
        assertEquals(true, BinaryRegexp.multipleOf3().matcher("000").matches());
        assertEquals(false, BinaryRegexp.multipleOf3().matcher("001").matches());
        assertEquals(true, BinaryRegexp.multipleOf3().matcher("011").matches());
        assertEquals(true, BinaryRegexp.multipleOf3().matcher("110").matches());
        assertEquals(false, BinaryRegexp.multipleOf3().matcher("111").matches());
        assertEquals(true, BinaryRegexp.multipleOf3().matcher(Integer.toBinaryString(12345678)).matches());
    }

    private boolean falsePositivesBetween(int min, int max) {
        for (int i = min; i < max; i++) {
            if (i % 3 != 0 && BinaryRegexp.multipleOf3().matcher(Integer.toBinaryString(i)).matches()) {
                return true;
            }
        }
        return false;
    }

    private boolean trueNegativesBetween(int min, int max) {
        for (int i = min; i < max; i++) {
            if (i % 3 == 0 && !BinaryRegexp.multipleOf3().matcher(Integer.toBinaryString(i)).matches()) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testFalsePositive() {
        assertEquals(false, falsePositivesBetween(0, 10000));
        assertEquals(false, falsePositivesBetween(1000000, 1010000));
    }

    @Test
    public void testTrueNegative() {
        assertEquals(false, trueNegativesBetween(0, 10000));
        assertEquals(false, trueNegativesBetween(1000000, 1010000));
    }

}
