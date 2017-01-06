package com.dkrybachuk.quick.union;

import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dk
 */
public class QuickUnionUF {
    
    private int[] id;
    
    public QuickUnionUF(int N) {
        id = new int[N];
        IntStream.range(0, N).forEach(i -> id[i] = i);   
    }
    
    private int root(int i) {
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }
    
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    
    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        id[pid] = qid;
    }
    
    public int length() {
        return id.length;
    }
}
