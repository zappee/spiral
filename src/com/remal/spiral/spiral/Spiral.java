package com.remal.spiral.spiral;

public class Spiral {
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

    public static void show(String[][] matrix) {
        for (String[] rows : matrix) {
            for (String row : rows) {
                System.out.print(row ==null ? "  " : row + " ");
            }
            System.out.print("\n");
        }
    }
}
