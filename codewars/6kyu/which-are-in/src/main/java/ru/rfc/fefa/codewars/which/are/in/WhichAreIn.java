/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.which.are.in;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dk
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        Set<String> result = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        for (String str : array1) {
            for (String substr : array2) {
                if (substr.indexOf(str) > 0) {
                    result.add(str);
                    System.out.println(str + " " + substr);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
