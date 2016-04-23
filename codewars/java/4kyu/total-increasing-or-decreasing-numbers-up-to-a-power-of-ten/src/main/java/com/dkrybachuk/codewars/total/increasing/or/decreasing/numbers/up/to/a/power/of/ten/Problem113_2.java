/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.total.increasing.or.decreasing.numbers.up.to.a.power.of.ten;

/**
 *
 * @author dk
 */
public class Problem113_2 {

    public static long totalIncDec(int n) {
        return Choose(n + 10, 10) + Choose(n + 9, 9) - 10 * n - 1;
    }

    private static long Choose(int n, int k) {
        k = Math.min(k, n - k);
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res *= n - k + i;
            res /= i;
        }
        return res;
    }

}
