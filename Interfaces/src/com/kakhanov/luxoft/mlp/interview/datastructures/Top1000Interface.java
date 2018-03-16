package com.kakhanov.luxoft.mlp.interview.datastructures;

public interface Top1000Interface<T> {
    void onData(Comparable<T> data);
    void printTopData();
}
