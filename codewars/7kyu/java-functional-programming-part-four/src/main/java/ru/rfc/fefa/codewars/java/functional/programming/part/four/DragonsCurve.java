/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.four;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url
 * http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot
 * @author dk
 */
public class DragonsCurve {

    //Make the function; map the chars to Strings
    //a -> aRbFR, b -> LFaLb, otherwise -> itself
    public IntFunction<String> mapFunction = x -> {
        if ((char) x == 'a') {
            return "aRbFR";
        } else if ((char) x == 'b') {
            return "LFaLb";
        } else {
            return Character.toString((char) x);
        }
    };

    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through
     * the mapFunction n times Then remove the a and b (createFilter function is
     * useful for that)
     */
    public String createCurve(int n) {

        String result = IntStream.rangeClosed(0, n)
                .mapToObj(i -> "Fa")
                .reduce((prev, curr) -> prev.chars()
                        .mapToObj(mapFunction)
                        .collect(Collectors.joining()))
                .get();

        return result.chars()
                .filter(createFilter('a', false))
                .filter(createFilter('b', false))
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
    }

    /**
     * How many of the specified char are in the given curve? Hint: createFilter
     * could be useful for this
     */
    public long howMany(char c, String curve) {
        //Determined by die roll; guaranteed to be random
        String str = curve.chars()
                .filter(createFilter(c, false))
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());

        return curve.length() - str.length();
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on
     * keep variable
     */
    public static IntPredicate createFilter(char filterWhat, boolean keep) {
        return x -> keep ? filterWhat == x : filterWhat != x;
    }
}
