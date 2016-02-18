/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.backwards.read.primes;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author dk
 */
public class BackWardsPrimeLoop {

    public static String backwardsPrime(long start, long end) {
        Set<Long> resultBuff = new TreeSet<>();
        
        for (long i = (start > 13 ? start: 13); i <= end; i++) {
            if (BigInteger.valueOf(i).isProbablePrime(10)) {
                Long r = Long.valueOf(new StringBuilder(Long.toString(i)).reverse().toString());
                if(BigInteger.valueOf(r).isProbablePrime(10) && !r.equals(i)) {
                    resultBuff.add(i);
                }
            }
        }
        return resultBuff.stream().map(x -> x.toString()).collect(Collectors.joining(" "));
    }

}
