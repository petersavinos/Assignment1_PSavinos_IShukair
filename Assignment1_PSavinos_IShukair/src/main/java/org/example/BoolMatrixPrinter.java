package org.example;

//prints bin matrix with # as 1 and ' ' as 0

public class BoolMatrixPrinter {

    ///print single row as binary val
    /// throws an exception if a non binary number is found
    ///


    @Override
    protected String printRow(Matrix matrix, int row){
        Stringbuilder sb = new StringBuilder();
        int[][] data = matrix.getData();
        for (int val : data[row]){
            if (val != 0 && val != 1)
                throw new IllegalArguementException("Matrix must only contain 0 or 1");
            sb.append(val == 1 ? '#' : " ");
        }
        return sb.toString();
    }
}
