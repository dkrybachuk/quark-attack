/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.codewars.pyramid.slide.down;

/**
 * @url nwod-edils-dimaryp/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        for (int row = pyramid.length - 2; row >= 0; row--) {
            for (int col = 0; col < pyramid[row].length; col++) {
                pyramid[row][col] += Math.max(pyramid[row + 1][col], pyramid[row + 1][col + 1]);
            }
        }
        return pyramid[0][0];
    }
}
