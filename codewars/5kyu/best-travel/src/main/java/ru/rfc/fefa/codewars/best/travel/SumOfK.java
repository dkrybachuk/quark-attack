/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.best.travel;

import java.util.List;

/**
 * @url levart-tseb/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (t < 0 || k < 1) {
            return null;
        }
        ls.stream().distinct().sorted();
        
        // your code
        return 1;
    }
}
