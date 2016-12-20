/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.large.factorials;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 *
 * @author sbt-rybachuk-dk
 */
public class Kata {

    public static String factorial(int n) {
        if (n < 2) {
            return "1";
        }
        return IntStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get().toString();
    }
}
