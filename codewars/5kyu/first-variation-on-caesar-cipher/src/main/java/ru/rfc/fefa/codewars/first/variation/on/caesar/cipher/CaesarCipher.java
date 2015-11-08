/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.first.variation.on.caesar.cipher;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url http://www.codewars.com/kata/first-variation-on-caesar-cipher
 * @author dk
 */
public class CaesarCipher {

    public static List<String> movingShift(String s, int shift) {
        System.out.println(stringShift(s, shift, true));
        return Collections.EMPTY_LIST;
    }

    public static String demovingShift(List<String> s, int shift) {
        String str = s.stream().collect(Collectors.joining());
        System.out.println(stringShift(str, shift, false));
        return "";
    }

    private static String stringShift(String s, int shift, boolean encode) {
        StringBuilder result = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(rotate(c, encode ? shift : -shift));
            } else {
                result.append(c);
            }
            shift++;
        }
        return result.toString();
    }

    private static char rotate(char c, int key) {
        String s = Character.isLowerCase(c) ? "abcdefghijklmnopqrstuvwxyz" : "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return IntStream.range(0, 26)
                .filter(i -> c == s.charAt(i))
                .mapToObj(i -> s.charAt(Math.floorMod((i + key + 26), 26)))
                .findFirst().get();
    }

}
