package com.remal.spiral.dictionary;

/**
 * Frame pattern implementation.
 * Pattern: a b c d e f
 *          t         g
 *          s         h
 *          r         i
 *          q         j
 *          p o n m l k
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public class FrameDictionary extends Dictionary {

    protected int dictionaryIndex = 0;
    protected int startX, endX;
    protected int startY, endY;

    /**
     * Constructor.
     *
     * @param matrixSize the size of the matrix
     */
    public FrameDictionary(int matrixSize) {
        super(matrixSize);
        startX = -1;
        endX = matrixSize - 1;
        startY = 0;
        endY = matrixSize - 1;
    }

    /**
     * Pattern builder method.
     * The pattern describes how to fill in the Matrix.
     *
     * @return the pattern
     */
    @Override
    public String[] createPattern() {
        while (dictionaryIndex < matrixSize) {
            pattern1();
            pattern2();
        }
        return dictionary;
    }

    /**
     * Pattern 1
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
     * Pattern 2
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
