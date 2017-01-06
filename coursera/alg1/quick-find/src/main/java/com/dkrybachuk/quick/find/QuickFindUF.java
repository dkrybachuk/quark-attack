/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.quick.find;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author dk
 */
public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        IntStream.range(0, N).forEach(i -> id[i] = i);
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        IntStream.range(0, id.length).forEach(i -> {
            if (id[i] == pid) {
                id[i] = qid;
            }
        });
    }

    public int length() {
        return id.length;
    }

}
