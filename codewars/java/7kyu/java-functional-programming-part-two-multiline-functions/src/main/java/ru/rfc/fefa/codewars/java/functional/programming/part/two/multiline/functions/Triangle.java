/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.java.functional.programming.part.two.multiline.functions;

/**
 *
 * @author dk
 */
public class Triangle {

    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;

    }

    public void setArea(double a) {
        area = a;
    }

    public double getArea() {
        return area;
    }
}
