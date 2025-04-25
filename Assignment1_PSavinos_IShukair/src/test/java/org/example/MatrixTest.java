package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * test for (@link Matrix}
 * <p>
 *     confirms that the constructor denies any invalid dimension
 *     confirms the the right row and col counts
 * </p>
 */

public class MatrixTest {


// test if contstructor throes an exception for invalid dimensions
    @Test
    public void testIllegalConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Matrix (0, 0));
    }

    @Test
    public void testRowAndColCounts(){
        Matrix m = new Matrix(3, 4); // fixed typo: matrix to Matrix
        assertEquals(3, m.getRowCount());
        assertEquals(4, m.getColCount());
    }

}