package com.me.kirilltrosnickii;

public class Array {
    // Метод для розрахунку середнього арифметичного елементів масиву
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }

    // Метод для перевірки, чи є двовимірний масив квадратним
    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }
        for (int[] ints : matrix) {
            if (ints.length != cols) {
                return false;
            }
        }
        return true;
    }
}
