/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.rectangle.into.squares;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sbt-rybachuk-dk
 */
public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        
        if (lng <= 0 || wdth <= 0 || lng == wdth) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        
        for (; wdth > 0;) {
            if (lng > wdth) {
                wdth ^= (lng ^= wdth);
                lng ^= wdth;
            }
            result.add(lng);
            wdth -= lng;
        }
        return result;
    }
}
