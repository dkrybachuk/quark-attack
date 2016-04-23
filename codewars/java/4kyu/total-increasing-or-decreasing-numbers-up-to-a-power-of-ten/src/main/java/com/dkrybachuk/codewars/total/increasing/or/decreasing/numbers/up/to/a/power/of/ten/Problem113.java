/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.total.increasing.or.decreasing.numbers.up.to.a.power.of.ten;

import java.math.BigInteger;

/**
 * @url http://www.codewars.com/kata/total-increasing-or-decreasing-numbers-up-to-a-power-of-10/java
 * @author dk
 */
public class Problem113 {

    public static BigInteger totalIncDec(int n) {
        return BigInteger.ZERO
                .add(Choose(BigInteger.valueOf(n + 10), BigInteger.valueOf(10)))
                .add(Choose(BigInteger.valueOf(n + 9), BigInteger.valueOf(9)))
                .subtract(BigInteger.valueOf(10 * n))
                .subtract(BigInteger.valueOf(1));

    }

    private static BigInteger Choose(BigInteger n, BigInteger k) {
        k = k.min(n.subtract(k));
        BigInteger res = BigInteger.ONE;
        for (BigInteger bi = BigInteger.ONE; bi.compareTo(k) <= 0; bi = bi.add(BigInteger.ONE)) {
            res = res.multiply(n.subtract(k).add(bi));
            res = res.divide(bi);
        }
        return res;
    }
}
