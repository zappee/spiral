package com.remal.spiral.dictionary;

/**
 * Snake pattern implementation.
 * Pattern: a b c d e f
 *          l k j i h g
 *          m n o p q r
 *          x w v u t s
 *          y z 1 2 3 4
 *          0 9 8 7 6 5
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public class SnakeDictionary extends Dictionary {

    private int dictionaryIndex = 0;
    private int startY = 0;

    /**
     * Constructor.
     *
     * @param matrixSize the size of the matrix
     */
    public SnakeDictionary(int matrixSize) {
        super(matrixSize);
    }

    /**
     * Pattern builder method.
     * The pattern describes how to fill in the Matrix.
     *
     * @return the pattern
     */
    @Override
    public String[] createPattern() {
        int pixelsInMatrix = matrixSize * matrixSize;
        while (dictionaryIndex < pixelsInMatrix) {
            pattern1();
            if (dictionaryIndex < pixelsInMatrix) {
                pattern2();
            }
        }

        return dictionary;
    }

    /**
     * Pattern 1
     * direction: left -> right
     */
    public void pattern1() {
        for (int i = 0; i < matrixSize; i++) {
            dictionary[dictionaryIndex] = i + ":" + startY;
            dictionaryIndex++;
        }
        startY++;
    }

    /**
     * Pattern 2
     * direction: right -> left
     */
    public void pattern2() {
        for (int i = matrixSize - 1; i >= 0; i--) {
            dictionary[dictionaryIndex] = i + ":" + startY;
            dictionaryIndex++;
        }
        startY++;
    }
}
