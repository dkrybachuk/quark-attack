/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.decode.the.morse.code.advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author dk
 */
public class MorseCodeDecoder {

    final static private Map<String, String> MorseCode = new HashMap<>();

    public static String decodeBits(String bits) {
        final StringBuilder result = new StringBuilder();

        final String trimedBits = bits.substring(bits.indexOf("1"),
                bits.lastIndexOf("1") + 1);

        final int bitLength = trimedBits.substring(trimedBits.indexOf("1"),
                (trimedBits.contains("0") ? trimedBits.indexOf("0") : trimedBits.length()))
                .length();

        final String pattern = String.format("((?<dash>1{%d})|(?<dot>1{%d})|(?<word>0{%d})|(?<char>0{%d})|(?<literal>0{%d}))", bitLength * 3, bitLength, bitLength * 7, bitLength * 3, bitLength);
        final Pattern binaryPattern = Pattern.compile(pattern);
        final Matcher matcher = binaryPattern.matcher(trimedBits);

        while (matcher.find()) {
            if (matcher.group("dot") != null) {
                result.append(".");
            } else if (matcher.group("dash") != null) {
                result.append("-");
            } else if (matcher.group("char") != null) {
                result.append(" ");
            } else if (matcher.group("word") != null) {
                result.append("   ");
            }
        }
        return result.toString();
    }

    public static String decodeMorse(String morseCode) {
        return Stream.of(morseCode.split("   "))
                .map(x -> {
                    return Stream.of(x.split(" "))
                    .map(chr -> MorseCode.get(chr))
                    .collect(Collectors.joining());
                })
                .collect(Collectors.joining(" "));
    }

    static {
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
        //-----------------------
        MorseCode.put(".----", "1");
        MorseCode.put("..---", "2");
        MorseCode.put("...--", "3");
        MorseCode.put("....-", "4");
        MorseCode.put(".....", "5");
        MorseCode.put("-....", "6");
        MorseCode.put("--...", "7");
        MorseCode.put("---..", "8");
        MorseCode.put("----.", "9");
        MorseCode.put("-----", "0");
        //-----------------------
        MorseCode.put(".-.-.-", ".");
        MorseCode.put("--..--", ",");
    }
}
