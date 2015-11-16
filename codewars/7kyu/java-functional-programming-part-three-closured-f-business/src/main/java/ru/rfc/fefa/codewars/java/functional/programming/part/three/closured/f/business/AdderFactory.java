/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.three.closured.f.business;

import java.util.function.IntFunction;

/**
 * @url http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business
 * @author dk
 */
public class AdderFactory {
    private static int i;
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static int create(int addTo) {
        i = addTo;
        return  1;
    }
}
