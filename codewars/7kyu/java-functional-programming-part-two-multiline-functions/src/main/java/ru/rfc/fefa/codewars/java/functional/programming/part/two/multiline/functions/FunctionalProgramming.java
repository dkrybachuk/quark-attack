/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.two.multiline.functions;

import java.util.function.ToDoubleFunction;

/**
 * @url http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions
 * @author dk
 */
public class FunctionalProgramming {
    public static ToDoubleFunction<Triangle> f = t -> 1/2 * t.base * t.height;
}
