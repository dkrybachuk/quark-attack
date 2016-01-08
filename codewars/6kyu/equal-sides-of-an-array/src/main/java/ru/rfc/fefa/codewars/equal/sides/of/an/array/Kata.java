/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.equal.sides.of.an.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @url yarra-na-fo-sedis-lauqe/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class Kata {

    public static int findEvenIndex(int[] arr) {
        return IntStream.range(1, arr.length - 1)
                .filter(x -> 
                        Arrays.stream(arr, 0, x).sum() == 
                                Arrays.stream(arr, x + 1, arr.length).sum())
                .findFirst().orElse(-1);
    }

}
