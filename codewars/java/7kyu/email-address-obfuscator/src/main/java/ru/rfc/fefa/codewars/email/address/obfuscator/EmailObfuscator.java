/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.email.address.obfuscator;

/**
 *
 * @author dk
 */
public class EmailObfuscator {

    public static String obfuscate(String email) {

        return email.replaceAll("\\.", " [dot] ").replaceAll("@", " [at] ");
    }
}
