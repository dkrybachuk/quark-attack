/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.second.variation.on.caesar.cipher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url http://www.codewars.com/kata/second-variation-on-caesar-cipher
 * @author dk
 */
public class CaesarTwo {

    private static final int MAX_PARTS = 5;

    public static List<String> encodeStr(String s, int shift) {
        if (s == null) {
            return Collections.EMPTY_LIST;
        }
        String firstLetter = s.substring(0, 1).toLowerCase();
        String keyLetter = stringShift(firstLetter, shift, true);
        String str = stringShift(s, shift, true);
        return splitString(firstLetter.concat(keyLetter).concat(str));
    }

    public static String decode(List<String> s) {
        String str = s.stream().collect(Collectors.joining());
        char key = str.charAt(0);
        char idx = str.charAt(1);
        int shift = (int) (idx - key);
        String decodedStr = stringShift(str, shift, false);
        return decodedStr.substring(2);
    }

    private static String stringShift(String s, int shift, boolean encode) {
        StringBuilder result = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(rotate(c, encode ? shift : -shift));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static char rotate(char c, int key) {
        final int DICTIONARY_LENGTH = 26;
        String sample = Character.isLowerCase(c) ? "abcdefghijklmnopqrstuvwxyz" : "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return IntStream.range(0, DICTIONARY_LENGTH)
                .filter(i -> c == sample.charAt(i))
                .mapToObj(i -> sample.charAt(Math.floorMod((i + key + DICTIONARY_LENGTH), DICTIONARY_LENGTH)))
                .findFirst().get();
    }

    private static List<String> splitString(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() % MAX_PARTS == 0) {
            result = cutString(s, (s.length() / MAX_PARTS));
        } else {
            boolean found = false;
            int partLength = 0;
            for (int numParts = MAX_PARTS - 1; numParts > 0; numParts--) {
                for (int stringLength = s.length(); stringLength > 0; stringLength--) {
                    if (stringLength % numParts == 0) {
                        if ((stringLength / numParts) >= (s.length() - (numParts * (stringLength / numParts)))) {
                            partLength = (stringLength / numParts);
                        } else {
                            found = true;
                            break;
                        }
                    }
                }
                if (found) {
                    break;
                }
            }
            result = cutString(s, partLength);
        }
        return result;
    }

    private static List<String> cutString(String s, int partLength) {
        List<String> result = new ArrayList<>(MAX_PARTS);
        int beginIndex = 0;
        int endIndex = partLength;
        while (endIndex <= s.length()) {
            result.add(s.substring(beginIndex, endIndex));
            beginIndex = endIndex;
            endIndex += partLength;
        }
        if (beginIndex < s.length()) {
            result.add(s.substring(beginIndex, s.length()));
        }
        return result;
    }
}
