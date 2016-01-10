/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.reverse.polish.notation.calculator;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @url rotaluclac-noitaton-hsilop-esrever/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class Calc {
    
    public double evaluate(String expr) {
        if (expr == null || expr.isEmpty()) {
            return 0;
        }
        Deque<Float> lifo = new ArrayDeque<>();
        
        for (String s : expr.split(" ")) {
            if (s.matches("[0-9.]+")) {
                lifo.addFirst(Float.valueOf(s));
            } else if (s.matches("[\\+\\-\\*\\/]")) {
                Float first = lifo.pollFirst();
                Float second = lifo.pollFirst();
                if ("+".equals(s)) {
                    //lifo.addFirst(first + second);
                    lifo.addFirst(second + first);
                } else if ("-".equals(s)) {
                    //lifo.addFirst(first - second);
                    lifo.addFirst(second - first);
                } else if ("*".equals(s)) {
                    //lifo.addFirst(first * second);
                    lifo.addFirst(second * first);
                } else if ("/".equals(s)) {
                    //lifo.addFirst(first / second);
                    lifo.addFirst(second / first);
                }
            }
        }
        return lifo.pollFirst();
    }
    
}
