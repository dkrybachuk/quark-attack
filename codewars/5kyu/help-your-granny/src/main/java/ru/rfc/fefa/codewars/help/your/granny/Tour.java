/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.help.your.granny;

import java.util.Arrays;
import java.util.Map;

/**
 * @url http://www.codewars.com/kata/help-your-granny
 * @author dk
 */
public class Tour {

    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        System.out.println(Arrays.toString(arrFriends));
        Arrays.stream(ftwns).forEach(x -> System.out.print(Arrays.toString(x)));
        System.out.println("");
        System.out.println(h);
        double result = 0;
        int lastTown =0;
        for (int i = 0; i < arrFriends.length; i++) {
            for (int j = 1; j < ftwns.length; j++) {
                if (arrFriends[i].equals(ftwns[j][0])) {
                    double hypotenuse = h.get(ftwns[j][1]);
                    double leg = h.get(ftwns[j - 1][1]);
                    result += Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(leg, 2));
                    lastTown = j;
                    break;
                } 
              
            }
        }
        result += h.get(ftwns[0][1]);
        result += h.get(ftwns[lastTown][1]);
        return (int)Math.floor(result);
    }
}
