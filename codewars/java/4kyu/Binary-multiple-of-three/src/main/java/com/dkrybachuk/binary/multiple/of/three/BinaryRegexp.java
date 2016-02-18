/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.binary.multiple.of.three;

import java.util.regex.Pattern;

/**
 * @url /3-fo-elpitlum-yranib/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class BinaryRegexp {

    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("(0*(1(01*0)*1)+)*0*");
    }
}
