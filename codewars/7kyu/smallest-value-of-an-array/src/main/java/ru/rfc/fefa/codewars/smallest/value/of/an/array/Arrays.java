/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.smallest.value.of.an.array;

import java.util.stream.IntStream;

/**
 *
 * @author dk
 */
public class Arrays {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        //TODO: Add solution here
        int value = IntStream.of(numbers).min().getAsInt();
        int index = IntStream.range(0, numbers.length).filter( i -> numbers[i] == value).findFirst().getAsInt();
        return ("index".equalsIgnoreCase(toReturn) ? index : value);
    }
}
