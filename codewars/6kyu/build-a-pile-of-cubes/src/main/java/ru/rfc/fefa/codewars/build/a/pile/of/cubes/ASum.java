/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.build.a.pile.of.cubes;

import java.util.stream.LongStream;

/**
 *
 * @author dk
 */
public class ASum {

    public static long findNb2(long m) {
        if (m <= 1) {
            return 1;
        }

        double tmp;
        long counter = 0;
        do {
            counter++;
            tmp = LongStream.range(1, counter + 1).asDoubleStream().reduce(0, (x, y) -> x + Math.pow(y, 3));
            if (tmp >= Long.MAX_VALUE) {
                counter = -1;
                break;
            }
        } while (tmp < m);

        return tmp == m ? counter : -1;
    }

    public static long findNb(long m) {
        if (m == 1) {
            return 1;
        }
        double sqrtM = Math.sqrt(m);
        
        System.out.println(Double.isFinite(sqrtM));
        System.out.println(Double.isInfinite(sqrtM));
        System.out.println(Double.isNaN(sqrtM));
        
        int result = 1;
        double triNum = 1;
        do {
            result++;
            triNum += result;
        } while (triNum < sqrtM);

        //return sqrtM == triNum ? result : -1;
        return Double.compare(sqrtM, triNum) == 0 ? result : -1;
    }
}
