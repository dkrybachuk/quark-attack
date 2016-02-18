/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.find.the.odd.intgr;

import static java.util.Arrays.stream;

/**
 *
 * @author dk
 */
public class FindOdd {

    public static int findIt(int[] A) {
        return stream(A).reduce((x, y) -> x ^ y).getAsInt();
    }
}
