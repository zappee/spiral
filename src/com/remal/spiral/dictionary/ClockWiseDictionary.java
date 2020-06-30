package com.remal.spiral.dictionary;

public class ClockWiseDictionary extends FrameDictionary {

    public ClockWiseDictionary(int matrixSize) {
        super(matrixSize);
    }

    @Override
    public String[] createPattern() {
        int pixelsInMatrix = matrixSize * matrixSize;
        while (dictionaryIndex < pixelsInMatrix) {
            pattern1();
            pattern2();
        }
        return dictionary;
    }
}
