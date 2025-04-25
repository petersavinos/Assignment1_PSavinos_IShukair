package org.example;

/**
 * the {@code Shape} class extends {@code Matrix} reps the pre existed pattern
 * made up of the binary vals
 */

public class Shape  extends Matrix {

    private String name; // string representation for name of the shape

    public Shape(String name, int[][] sData) { // constructor which initializes the shape with its name and 2D array (shape data)
        super(sData);

        for (int[] row : sData) { // checks that the values for rows in shape data are either a 0 or 1.
            for (int val : row) {
                if (val != 0 && val != 1) {
                    throw new IllegalArgumentException("The shape data must be a 0 or 1."); // Otherwise throws an exception
                }
            }
        }
        this.name = name; // sets the name of the shape
    }
    public String getName() {
        return name; // returns a string representation of the name of the shape
    }

}
