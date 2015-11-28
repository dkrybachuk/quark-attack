/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.rfc.fefa.codewars.best.travel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @url levart-tseb/atak/moc.srawedoc.www//:ptth
 * @author dk
 */
public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (t < 0 || k < 1 || k > ls.size()) {
            return null;
        }
        List<List<Integer>> townsDistances = new ArrayList<>();
        int[] counter = IntStream.range(0, k).toArray();
        int[] lastDist = IntStream.range((ls.size() - k), ls.size()).toArray();

        List<Integer> dist = IntStream.of(counter)
                .map(ls::get).boxed()
                .collect(Collectors.toList());
        townsDistances.add(dist);

        while (!Arrays.equals(counter, lastDist)) {
            for (int i = 0; i < ls.size(); i++) {
                int pos = (k - 1) - i;
                if (counter[pos] < (ls.size() - 1) - i) {
                    counter[pos]++;
                    for (int j = pos + 1; j < counter.length; j++) {
                        counter[j] = counter[j - 1] + 1;
                    }
                    break;
                }
            }
            dist = IntStream.of(counter)
                    .map(ls::get).boxed()
                    .collect(Collectors.toList());
            townsDistances.add(dist);
        }

        Integer result;
        try {
            result = townsDistances.stream()
                    .mapToInt(d
                            -> d.stream().collect(
                                    Collectors.summingInt(Integer::intValue)))
                    .filter(distSum -> distSum <= t)
                    .max().getAsInt();
        } catch (NoSuchElementException e) {
            return null;
        }
       
        return result;
    }
}
