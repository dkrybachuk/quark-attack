/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.financing.plan.on.planet.xy140z.n;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 *
 * @author dk
 */
public class Finance {

    public static BigInteger finance(int n) {
        // http://mathforum.org/library/drmath/view/56870.html
        //    (3n + 3n^2)
        //    -----------
        //        2

        Double i = IntStream.range(0, n + 1).mapToDouble(x -> ((3 * x + 3 * Math.pow(x, 2)) / 2)).reduce(0, (x, y) -> x + y);
        return BigDecimal.valueOf(i).toBigInteger();
    }
}
