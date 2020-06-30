package com.remal.spiral.dictionary;

/**
 * Clock-wise pattern implementation.
 * Pattern: a b c d e f
 *          t u v w x g
 *          s 6 7 8 y h
 *          r 5 0 9 z i
 *          q 4 3 2 1 j
 *          p o n m l k
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public class ClockWiseDictionary extends FrameDictionary {

    /**
     * Constructor.
     *
     * @param matrixSize the size of the matrix
     */
    public ClockWiseDictionary(int matrixSize) {
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
            pattern2();
        }
        return dictionary;
    }
}
