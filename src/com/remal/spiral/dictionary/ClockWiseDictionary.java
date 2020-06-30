package com.remal.spiral.dictionary;

public class ClockWiseDictionary extends FrameDictionary {

    public ClockWiseDictionary(int matrixSize) {
        super(matrixSize);
    }

    @Override
    public String[] createPattern() {
        while (dictionaryIndex < matrixSize * matrixSize) {
            pattern1();
            pattern2();
        }
        return dictionary;
    }
}
