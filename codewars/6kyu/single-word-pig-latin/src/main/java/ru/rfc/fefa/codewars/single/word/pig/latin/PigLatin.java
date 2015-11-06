/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.single.word.pig.latin;

/**
 * @url http://www.codewars.com/kata/558878ab7591c911a4000007/train/java
 * @author dk
 */
public class PigLatin {

    public String translate(String str) {
        //good code
        StringBuilder result = new StringBuilder(str.toLowerCase());
        
        if (str.matches(".*\\d+.*")) {
            return null;
        }

        int strPos = 0;
        for (Character c : str.toLowerCase().toCharArray()) {
            if (c == 'a'
                    || c == 'e'
                    || c == 'i'
                    || c == 'o'
                    || c == 'u') {
                if (strPos == 0) {
                    result.append("way");
                    break;
                } else {
                    result.append("ay");
                    break;
                }
            } else {
                result.append(c);
                result.deleteCharAt(0);
                if (strPos == str.length() - 1) {
                    result.append("ay");
                }
            }
            strPos++;
        }
        return result.toString();
    }
}
