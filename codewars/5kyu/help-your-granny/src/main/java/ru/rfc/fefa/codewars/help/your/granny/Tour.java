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
        double[][] route = new double[arrFriends.length + 1][2];
        int prevTown = 0;
        for (int friendIdx = 0; friendIdx < arrFriends.length; friendIdx++) {
            for (int townIdx = 0; townIdx < ftwns.length; townIdx++) {
                if (arrFriends[friendIdx].equals(ftwns[townIdx][0])) {
                    if (friendIdx == 0) {
                        route[friendIdx][0] = h.get(ftwns[townIdx][1]);
                    } else {
                        route[friendIdx][0] = h.get(ftwns[townIdx][1]);
                        route[friendIdx][1] = h.get(ftwns[prevTown][1]);
                    }
                    prevTown = townIdx;
                }
            }
        }
        route[route.length - 1][0] = h.get(ftwns[prevTown][1]);
        for (int i = 0; i < route.length; i++) {
            result += Math.sqrt(Math.pow(route[i][0], 2) - Math.pow(route[i][1], 2)); 
        }
        return (int) Math.floor(result);
    }

}
