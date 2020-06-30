package com.remal.spiral.spiral;

/**
 * This is a helper class for to fill in the Spiral Matrix.
 *
 * <p>
 * created on 30/06/2020
 * </p>
 *
 * @author arnold.somogyi@gmail.com
 */
public class Spiral {

    /**
     *
     * @param sentence the given text which will be spiralized
     * @param pattern the pattern, describe how the spiral looks like
     * @param matrix the matrix, contains the final data
     */
    public static void fill(String sentence, String[] pattern, String[][] matrix) {
        int i = 0;
        for (String coordinates : pattern) {
            if (coordinates != null) {
                String[] parts = coordinates.split(":");
                int x = Integer.parseInt(parts[1]);
                int y = Integer.parseInt(parts[0]);
                matrix[x][y] = (i < sentence.length()) ? sentence.substring(i, i + 1) : " ";
                i++;
            }
        }
    }

    /**
     * Print the martix to the screen.
     *
     * @param matrix the matrix to print
     */
    public static void show(String[][] matrix) {
        for (String[] rows : matrix) {
            for (String row : rows) {
                System.out.print(row ==null ? "  " : row + " ");
            }
            System.out.print("\n");
        }
    }
}
