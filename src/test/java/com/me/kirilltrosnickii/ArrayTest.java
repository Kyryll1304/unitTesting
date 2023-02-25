package com.me.kirilltrosnickii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        boolean result = Array.isSquareMatrix(matrix);
        assertTrue(result);
    }
}
