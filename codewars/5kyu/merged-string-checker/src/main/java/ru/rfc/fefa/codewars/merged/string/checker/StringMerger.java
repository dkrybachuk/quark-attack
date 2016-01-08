/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.merged.string.checker;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @url rekcehc-gnirts-degrem/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if (s.isEmpty() && part1.isEmpty() && part2.isEmpty()) {
            return true;
        } else if (s.isEmpty() || part1.isEmpty() || part2.isEmpty()) {
            return false;
        }

        IntPredicate mergeTest = new IntPredicate() {
            int left = 0;
            int right = 0;

            @Override
            public boolean test(int value) {
                boolean isMatch = false;
                if (left < part1.length()
                        && s.charAt(value) == part1.charAt(left)) {
                    left++;
                    isMatch = true;
                }
                if (right < part2.length()
                        && s.charAt(value) == part2.charAt(right)) {
                    right++;
                    isMatch = true;
                }
                return isMatch;
            }
        };

        long matched = IntStream.range(0, s.length()).filter(mergeTest).count();
        return s.length() == matched;
    }

    public static boolean chk(String orig, String s) {
        int l = IntStream.range(0, orig.length() <= s.length() ? orig.length() : s.length()).filter(x -> orig.charAt(x) == s.charAt(x)).max().getAsInt();
        return s.equals(orig.substring(0, l + 1));
    }

    public static void p(String s, int l) {
        if (l < 0 && s.length() < l + 1) {
            return;
        }
        char[] str = s.toCharArray();
        for (int i = l; i < str.length - 1; i++) {
            char tmp = str[i];
            str[i] = str[i + 1];
            str[i + 1] = tmp;
            System.out.println(Arrays.toString(str));
        }
        p(new String(str), l-1);
    }

}
