package com.me.kirilltrosnickii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.me.kirilltrosnickii.Array.isSquareMatrix;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {

    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double result = Array.calculateAverage(array);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testIsSquareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean result = isSquareMatrix(matrix);
        assertTrue(result);
    }

    @Test
    public void testIsSquareMatrix_WithNullMatrix_ReturnsFalse() {
        int[][] matrix = null;
        Assertions.assertThrows(NullPointerException.class, () -> Array.isSquareMatrix(matrix));

    }



    @Test
    public void testIsSquareMatrixWithRowContainingNull() {
        int[][] matrix = {{1, 2, 3}, null, {7, 8, 9}};
        Assertions.assertThrows(NullPointerException.class, () -> Array.isSquareMatrix(matrix));
    }



    @Test
    public void testIsSquareMatrixWithNonSquareMatrix() {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        boolean result = isSquareMatrix(matrix);
        assertFalse(result);
    }

    @Test
    public void testCalculateAverageWithEmptyArray() {
        int[] array = {};
        double result = Array.calculateAverage(array);
        assertEquals(Double.NaN, result, 0.00001);
    }

    @Test
    public void testCalculateAverageWithSingleElementArray() {
        int[] array = {5};
        double result = Array.calculateAverage(array);
        assertEquals(5, result, 0.00001);
    }


}
