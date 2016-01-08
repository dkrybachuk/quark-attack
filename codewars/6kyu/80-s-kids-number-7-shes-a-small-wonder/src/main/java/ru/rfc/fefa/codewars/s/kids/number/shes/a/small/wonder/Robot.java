/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.s.kids.number.shes.a.small.wonder;

import java.util.HashSet;
import java.util.Set;

/**
 * @url rednow-llams-a-sehs-7-rebmun-sdik-s-08/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class Robot {

    private final static String NOT_UNDERSTAND = "I do not understand the input";
    private final static String ALREADY_KNOW = "I already know the word %s";
    private final static String THANK_YOU = "Thank you for teaching me %s";

    private final Set<String> dict = new HashSet<>();

    public Robot() {
        StringBuilder str = new StringBuilder();
        str.append(NOT_UNDERSTAND).append(" ");
        str.append(ALREADY_KNOW).append(" ");
        str.append(THANK_YOU);
        for (String s : str.toString().split(" ")) {
            learnWord(s);
        }

    }

    public final String learnWord(String str) {

        if (!str.matches("[a-zA-Z]+")) {
            return NOT_UNDERSTAND;
        }

        if (dict.contains(str.toLowerCase())) {
            return String.format(ALREADY_KNOW, str);
        } else {
            dict.add(str.toLowerCase());
            return String.format(THANK_YOU, str);
        }
    }

}
