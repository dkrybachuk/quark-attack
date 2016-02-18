/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.first.variation.on.caesar.cipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url http://www.codewars.com/kata/first-variation-on-caesar-cipher
 * @author dk
 */
public class CaesarCipher {

    private static final int MAX_PARTS = 5;
    private static final int DICTIONARY_LENGTH = 26;

    public static List<String> movingShift(String s, int shift) {
        return splitString(stringShift(s, shift, true));
    }

    public static String demovingShift(List<String> s, int shift) {
        String str = s.stream().collect(Collectors.joining());
        return stringShift(str, shift, false);
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
                        //System.out.println("we found " + part + " groups by " + (len / part) + " (" + (len / part) * part + ") elements and " + (s.length() - (part * (len / part))));
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
        if (result.size() < MAX_PARTS) {
            for (int i = 0; i < MAX_PARTS - result.size(); i++) {
                result.add("");
            }
        }
        return result;
    }
}
