/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.one.the.beginning;

import java.util.function.Function;

/**
 * @url http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning
 * @author dk
 */
public class FunctionalProgramming {
    public static Function<Student, Boolean> f = (Student s) 
            -> ("John Smith".equalsIgnoreCase(s.getFullName()) 
                    && "js123".equalsIgnoreCase(s.studentNumber));
}
