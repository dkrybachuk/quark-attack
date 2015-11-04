/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.compound.array;

/**
 *
 * @author dk
 */
public class CompoundArray {

    public static int[] compoundArray(int[] a, int[] b) {
        //Who Dares wins!        
        int[] result = new int[a.length + b.length];
        int minLength = a.length < b.length ? a.length : b.length;
        int i = 0;
        for (int j = 0; j < minLength * 2; j++) {
            if (j % 2 == 0) {
                result[j] = a[i];
            } else {
                result[j] = b[i];
                i++;
            }
        }
        System.arraycopy((a.length > b.length ? a : b), minLength, result, minLength * 2, (a.length > b.length ? a.length : b.length) - minLength);
        return result;
    }
}
