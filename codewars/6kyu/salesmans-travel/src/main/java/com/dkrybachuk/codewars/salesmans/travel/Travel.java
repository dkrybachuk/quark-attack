/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.salesmans.travel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @url levart-snamselas/atak/moc.srawedoc.www//:ptth
 * @author ribachuk
 */
public class Travel {

    private final static Pattern pattern = Pattern.compile("(?<nb>\\d{1,5}) (?<str>.+?) (?<zipcode>[A-Z]{2} \\d{5}),?");

    public static String travel(String r, String zipcode) {
        final Matcher matcher = pattern.matcher(r);
        final StringBuilder result = new StringBuilder();
        final StringBuilder nb = new StringBuilder();

        result.append(zipcode)
                .append(":");
        String delimiter = "";
        while (matcher.find()) {
            if (zipcode.equals(matcher.group("zipcode"))) {
                result.append(delimiter)
                        .append(matcher.group("str"));
                nb.append(delimiter)
                        .append(matcher.group("nb"));
                if (delimiter.isEmpty()) {
                    delimiter = ",";
                }
            }
        }
        result.append("/").append(nb);
        System.out.println(result.toString());
        return result.toString();
    }
}
