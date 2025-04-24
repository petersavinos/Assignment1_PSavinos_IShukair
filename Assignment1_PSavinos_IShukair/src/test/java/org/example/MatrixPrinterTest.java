package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MatrixPrinterTest {

    //test the outline printer o see if it will create the right border
    @Test
    public void testOutlinePrinter(){
        Matrix m = new Matrix(3, 4);
        MatrixPrinter printer = new MatrixOutlinePrinter();
        String result = printer.print(m);
        assertTrue(result.contains("+----+"));
    }
    //test bmp throws an invalid data
    @Test
    public void testBoolPrinterThrowException(){
        Matrix m = new Matrix(new int [][]{{1, 0}, {2, 1}});
        BoolMatrixPrinter printer = new BoolMatrixPrinter();
        assertThrows(IllegalArgumentException.class, () -> printer.print(m)); // fixed typo
    }

    //test bmp outputs # properly
    @Test
    public void testBoolPrinterOutput(){
        Matrix m = new Matrix(new int[][]{{1, 0}, {0, 1}});
        BoolMatrixPrinter printer =  new BoolMatrixPrinter();
        String result = printer.print(m);
        assertTrue(result.contains("#"));
    }
}
