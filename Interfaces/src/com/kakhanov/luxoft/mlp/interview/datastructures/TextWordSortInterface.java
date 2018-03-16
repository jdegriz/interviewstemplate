package com.kakhanov.luxoft.mlp.interview.datastructures;

public interface TextWordSortInterface {
    String WORD_SEPARATOR = " ";
    String LINE_SEPARATOR = System.lineSeparator();

    String getWordCounts(String text);
}
