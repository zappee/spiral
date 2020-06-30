package com.remal.spiral.dictionary;

public class FrameDictionary extends Dictionary {

    protected int dictionaryIndex = 0;
    protected int startX, endX;
    protected int startY, endY;

    public FrameDictionary(int matrixSize) {
        super(matrixSize);
        startX = -1;
        endX = matrixSize - 1;
        startY = 0;
        endY = matrixSize - 1;
    }

    @Override
    public String[] createPattern() {
        while (dictionaryIndex < matrixSize) {
            pattern1();
            pattern2();
        }
        return dictionary;
    }

    /**
     * pattern 1
     * direction: left -> right then top -> bottom
     */
    protected void pattern1() {
        startX++;
        for (int i = startX; i <= endX; i++) {
            dictionary[dictionaryIndex] = i + ":" + startY;
            dictionaryIndex++;
        }

        startY++;
        for (int i = startY; i <= endY; i++) {
            dictionary[dictionaryIndex] = endX + ":" + i;
            dictionaryIndex++;
        }
    }

    /**
     * pattern 2
     * direction: right -> left then bottom -> top
     */
    protected void pattern2() {
        endX--;
        for (int i = endX; i >= startX; i--) {
            dictionary[dictionaryIndex] = i + ":" + endY;
            dictionaryIndex++;
        }

        endY--;
        for (int i = endY; i >= startY; i--) {
            dictionary[dictionaryIndex] = startX + ":" + i;
            dictionaryIndex++;
        }
    }
}
