package com.remal.spiral.dictionary;

import java.util.Arrays;
import java.util.Objects;

/**
 * Base dictionary class.
 * This can be extended when you implement a new Spiral Pattern.
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public abstract class Dictionary {

    protected int matrixSize;
    protected String[] dictionary;

    /**
     * Constructor.
     *
     * @param matrixSize the size of the matrix
     */
    public Dictionary(int matrixSize) {
        this.matrixSize = matrixSize;
        dictionary = new String[matrixSize * matrixSize];
    }

    /**
     * Pattern builder method.
     * The pattern describes how to fill in the Matrix.
     *
     * @return the pattern
     */
    public abstract String[] createPattern();

    /**
     * Displays the pattern on the screen.
     */
    public void showPattern() {
        if (Objects.nonNull(dictionary)) {
            Arrays.stream(dictionary).forEach(System.out::println);
        } else {
            System.out.println("Dictionary has not been initialized yet.");
        }
    }
}
