/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.bagels;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * @author dk
 */
public class BagelSolver {

    private static void setFinalStatic(Field field, Object value) throws Exception {
        field.setAccessible(true);
        
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, value);
    }

    public static Bagel getBagel() {
        // TODO : Implement me.
        try {
            Field field = Boolean.class.getField("TRUE");
            field.setAccessible(true);
            
            Field modField = Field.class.getDeclaredField("modifiers");
            modField.setAccessible(true);
            modField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
            
            field.set(null, false);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        } 
        return new Bagel();
    }


}
