/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.backwards.read.primes;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 *
 * @author dk
 */
public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        // Нет проверки что число палиндром
        // str.equals(new StringBuilder(str).reverse().toString());
        if (start < 13) {
            start = 13;
        }
        LongStream prime = LongStream.range(start, end).filter(x -> BigInteger.valueOf(x).isProbablePrime(10));
        LongStream emirp = prime.filter(x -> BigInteger.valueOf(Long.parseLong(new StringBuilder(Long.toString(x)).reverse().toString())).isProbablePrime(10));

        return emirp.boxed().map(i -> i.toString()).collect(Collectors.joining(" "));
    }

}
