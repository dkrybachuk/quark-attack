/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.three.closured.f.business;

import java.util.function.IntUnaryOperator;

/**
 * @url
 * http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business
 * @author dk
 */
public class AdderFactory {

    public static IntUnaryOperator create(int addTo) {
        return x -> x + addTo;
    }
}
