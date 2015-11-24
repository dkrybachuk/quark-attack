/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.best.travel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url levart-tseb/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (t < 0 || k < 1) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> stopKey = ls.subList((ls.size() - k), ls.size());
        int[] counter = IntStream.range(0, k).toArray();
        System.out.println(Arrays.toString(counter));
        List<Integer> tmp = IntStream.of(counter).map(i -> ls.get(i)).boxed().collect(Collectors.toList());
        result.add(tmp);
        while (!tmp.equals(stopKey)) {
            for (int i = 0; i < ls.size(); i++) {
                int pos = (k - 1) - i;
                if (counter[pos] < (ls.size()-1) - i) {
                    counter[pos]++;
                    for (int j = pos + 1; j < counter.length; j++) {
                        counter[j] = counter[j - 1] + 1;
                    }
                    break;
                }
            }
            System.out.println(Arrays.toString(counter));
            tmp = IntStream.of(counter).map(i -> ls.get(i)).boxed().collect(Collectors.toList());
            result.add(tmp);
        }

        // your code
        return 1;
    }
}
