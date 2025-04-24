package org.example;

public class Matrix { // Matrix class that represents a 2D matrix of ints

    private int[][] data; // representation for the matrix using a 2D array

    public Matrix(int rows, int cols) { // constructor to initialize an empty matrix with row and columns as parameters
        if (rows < 1 || cols < 1) { // checks to see if the matrix has at least 1 row and 1 column otherwise throws an exception
            throw new IllegalArgumentException("Matrix needs to have at least 1 row and 1 column.");
        }
        this.data = new int[rows][cols]; // initializes the array with 0 as the values for the rows and columns
    }

    public Matrix(int[][] inputData) { // constructor to create a matrix with an already existing 2D array
        if (inputData == null || inputData.length < 1 || inputData[0].length < 1) { // checks if the inputted 2D array is non-null and has at least 1 row and 1 column otherwise throws an exception
            throw new IllegalArgumentException("Input data must be non-null with at least 1 row and 1 column.");
        }
        this.data = inputData; // directly assigns the existing 2D array
    }

    public int[][] getData() {return data;} // a get method to return the data for the matrix

    public void setData(int[][] data) {this.data = data;} // method to set the data for the matrix

    public int getRowCount() {return data.length;} // method to return the number of rows in the matrix

    public int getColCount() {return data[0].length;} // method to return the number of columns in the matrix
}
