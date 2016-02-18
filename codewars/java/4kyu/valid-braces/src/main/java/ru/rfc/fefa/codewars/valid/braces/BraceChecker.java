/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.valid.braces;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @url secarb-dilav/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class BraceChecker {

    private static final String OPEN_BRACES = "([{";
    private static final String CLOSE_BRACES = ")]}";

    Deque<Character> lifo = new LinkedList<>();

    public boolean isValid(String braces) {
        if (braces == null || braces.isEmpty()) {
            return false;
        }
        for (int i = 0; i < braces.length(); i++) {
            char brace = braces.charAt(i);
            if (OPEN_BRACES.contains(String.valueOf(brace))) {
                lifo.addFirst(brace);
            } else if (CLOSE_BRACES.contains(String.valueOf(brace))) {
                if ((brace == ')' && lifo.getFirst() == '(')
                        || (brace == ']' && lifo.getFirst() == '[')
                        || (brace == '}' && lifo.getFirst() == '{')) {
                    lifo.removeFirst();
                } else {
                    return false;
                }
            }
        }

        return lifo.isEmpty();
    }
}
