/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.first.variation.on.caesar.cipher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url http://www.codewars.com/kata/first-variation-on-caesar-cipher
 * @author dk
 */
public class CaesarCipher {

    public static List<String> movingShift(String s, int shift) {
        return splitString(stringShift(s, shift, true));
    }

    public static String demovingShift(List<String> s, int shift) {
        System.out.println(s);
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
        return IntStream.range(0, 26)
                .filter(i -> c == sample.charAt(i))
                .mapToObj(i -> sample.charAt(Math.floorMod((i + key + 26), 26)))
                .findFirst().get();
    }

    private static List<String> splitString(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() % 5 == 0) {
            result = cutString(s, 5);
            // result = cutString(s, (s.length() / 5));
        } else {
            boolean found = false;
            for (int part = 4; part > 0; part--) {
                // Переделать цикл на do-while, и останавливаться тогда когда остаток строки будет больше количества символов в группе
                for (int len = s.length(); len > 0; len--) {
                    if (len % part == 0) {
                        System.out.println("we found " + part + " groups by " + (len / part) + " (" + (len / part) * part + ") elements and " + (s.length() - (part * (len / part))));
                        result = cutString(s, part);
                        //result = cutString(s, (len / part));
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        }
        return result;
    }

    private static List<String> cutString(String s, int parts) {
        //TODO: Сделать нарезку не по частям, а по количеству символов
        // Нарезаем строку, пока endIndex не выдет за границу строки,
        // в таком случае endIndex = s.length();
        List<String> result = new ArrayList<>();
        int beginIndex = 0;
        int endIndex = s.length() / parts;
        while (endIndex <= s.length()) {
            result.add(s.substring(beginIndex, endIndex));
            beginIndex = endIndex;
            endIndex += s.length() / parts;
        }
        if (beginIndex < s.length()) {
            result.add(s.substring(beginIndex, s.length()));
        }
        return result;
    }
}
