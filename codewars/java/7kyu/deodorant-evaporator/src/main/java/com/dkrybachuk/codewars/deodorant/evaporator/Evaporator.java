/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.deodorant.evaporator;

/**
 * @url http://www.codewars.com/kata/deodorant-evaporator/
 * @author dk
 */
public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int result = 0;
        double percent = 100;
        while (percent > threshold) {
            percent = percent - percent * (evap_per_day/100);
            result++;
        }
        return result;
    }
    
    public static int evaporatorLn(double content, double evap_per_day, double threshold) {
        Double result = Math.ceil(Math.log(threshold/100) / Math.log(1-(evap_per_day/100)));
        return result.intValue();
    }
}
