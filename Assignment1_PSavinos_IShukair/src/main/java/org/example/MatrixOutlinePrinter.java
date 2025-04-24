package org.example;

public class MatrixOutlinePrinter implements MatrixPrinter {

    protected String printRow(Matrix matrix, int row) { // creates a string representation for each row of the matrix
        StringBuilder strBuild = new StringBuilder();
        for (int col = 0; col < matrix.getColCount(); col++) {
            strBuild.append(" "); // appends a space for each column
        }
        return strBuild.toString(); // returns the string for the row
    }

    @Override
    public String print(Matrix matrix) { // creates a string that represents the outline of the whole matrix
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("+"); // top border representation
        for (int i = 0; i < matrix.getColCount(); i++) strBuild.append("-");
        strBuild.append("+\n");


        for (int i = 0; i < matrix.getRowCount(); i++) {
            strBuild.append("|"); // left border representation
            strBuild.append(printRow(matrix, i)); // prints the rows of spaces
            strBuild.append("|\n"); // right border representation
        }

        strBuild.append("+"); // bottom border representation
        for (int i = 0; i < matrix.getColCount(); i++) strBuild.append("-");
        strBuild.append("+\n");

        return strBuild.toString(); // returns a string representation of the completed outline of the matrix
    }

}
