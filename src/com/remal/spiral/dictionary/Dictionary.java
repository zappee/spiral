package com.remal.spiral.dictionary;

import java.util.Arrays;

public abstract class Dictionary {

    protected int matrixSize;
    protected String[] dictionary;

    public Dictionary(int matrixSize) {
        this.matrixSize = matrixSize;
        dictionary = new String[matrixSize * matrixSize];
    }

    public abstract String[] createPattern();

    public void showPattern() {
        Arrays.stream(dictionary).forEach(System.out::println);
    }
}
