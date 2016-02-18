/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.lario.and.muigi.pipe.problem;

import java.util.stream.IntStream;

/**
 * @url /melborp-epip-igium-dna-oiral/atak/moc.srawedoc.www//:ptth
 * @author ribachuk
 */
public class Kata {

    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
