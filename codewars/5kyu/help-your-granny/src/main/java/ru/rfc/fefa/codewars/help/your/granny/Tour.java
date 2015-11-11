/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.help.your.granny;

import java.util.Map;

/**
 * @url http://www.codewars.com/kata/help-your-granny
 * @author dk
 */
public class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        double result = 0;
        for (int j = 1; j < ftwns.length; j++) {
            double hypotenuse = h.get(ftwns[j][1]);
            double leg = h.get(ftwns[j - 1][1]);
            result += Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(leg, 2));
        }
        result += h.get(ftwns[0][1]);
        result += h.get(ftwns[ftwns.length - 1][1]);
        return (int) Math.round(result);
    }
}
