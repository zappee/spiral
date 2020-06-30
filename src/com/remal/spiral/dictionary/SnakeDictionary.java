package com.remal.spiral.dictionary;

public class SnakeDictionary extends Dictionary {

    private int dictionaryIndex = 0;
    private int startY = 0;

    public SnakeDictionary(int matrixSize) {
        super(matrixSize);
    }

    @Override
    public String[] createPattern() {
        while (dictionaryIndex < matrixSize * matrixSize) {
            pattern1();
            if (dictionaryIndex < matrixSize * matrixSize) {
                pattern2();
            }
        }

        return dictionary;
    }

    public void pattern1() {
        for (int i = 0; i < matrixSize; i++) {
            dictionary[dictionaryIndex] = i + ":" + startY;
            dictionaryIndex++;
        }
        startY++;
    }

    public void pattern2() {
        for (int i = matrixSize - 1; i >= 0; i--) {
            dictionary[dictionaryIndex] = i + ":" + startY;
            dictionaryIndex++;
        }
        startY++;
    }
}
