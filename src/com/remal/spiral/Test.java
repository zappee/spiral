package com.remal.spiral;

import com.remal.spiral.dictionary.ClockWiseDictionary;
import com.remal.spiral.dictionary.Dictionary;
import com.remal.spiral.dictionary.FrameDictionary;
import com.remal.spiral.dictionary.SnakeDictionary;
import com.remal.spiral.spiral.Spiral;

/**
 * Test class for the Spiral.
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public class Test {
    /**
     * The size of the matrix.
     */
    private static final int MATRIX_SIZE = 6;

    /**
     * Entrance point of the application.
     *
     * @param args application start parameters, not used
     */
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz1234567890";
        String[][] spiral = new String[MATRIX_SIZE][MATRIX_SIZE];

        System.out.println("frame spiral:");
        Dictionary dictionary = new FrameDictionary(MATRIX_SIZE);
        String[] pattern = dictionary.createPattern();
        Spiral.fill(sentence, pattern, spiral);
        Spiral.show(spiral);

        System.out.println("clock-wise spiral:");
        dictionary = new ClockWiseDictionary(MATRIX_SIZE);
        pattern = dictionary.createPattern();
        Spiral.fill(sentence, pattern, spiral);
        Spiral.show(spiral);

        System.out.println("snake spiral:");
        dictionary = new SnakeDictionary(MATRIX_SIZE);
        pattern = dictionary.createPattern();
        Spiral.fill(sentence, pattern, spiral);
        Spiral.show(spiral);
    }
}
