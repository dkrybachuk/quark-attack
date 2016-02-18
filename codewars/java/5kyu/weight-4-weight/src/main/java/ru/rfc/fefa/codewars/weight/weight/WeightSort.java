/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.weight.weight;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * @url thgiew-rof-thgiew/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class WeightSort {

    public static BiFunction<String, String, Integer> fun = (firstStr, secondStr) -> {
        int firstSum = firstStr.chars().map(Character::getNumericValue).sum();
        int secondSum = secondStr.chars().map(Character::getNumericValue).sum();
        int result = Integer.compare(firstSum, secondSum);

        if (result == 0) {
            result = firstStr.compareTo(secondStr);
        }
        return result;
    };

    public static String orderWeight(String strng) {
        String result = "";
        String[] arr = strng.split("\\s+");
        Arrays.sort(arr, (firstStr, secondStr) -> fun.apply(firstStr, secondStr));
        result = Arrays.toString(arr).replaceAll("[\\,\\[\\]]", "");
        return result;
    }
}
