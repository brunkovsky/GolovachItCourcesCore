package Procedural;

import java.util.Arrays;

public class MyArrays {

    public static void fillRandom(int[][] matrix, int amount) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * amount);
            }
        }
    }

    public static void bubbleSort(int[] array) {
        checkNullArg(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortInvert(int[] array) {
        checkNullArg(array);
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        checkNullArg(array);
        for (int i = 1; i < array.length; i++) {
            int position = i;
            int temp = array[position];
            while (position > 0 && (temp < array[position - 1])) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = temp;
        }
    }

    public static void insertionSortExtended(int[] array) {
        checkNullArg(array);
        for (int i = 1; i < array.length; i++) {
            int insertIndex = Arrays.binarySearch(array, 0, i, array[i]);
            if (insertIndex < 0) {
                insertIndex = Math.abs(insertIndex) - 1;
            }
            int temp = array[i];
            System.arraycopy(array, insertIndex, array, insertIndex + 1, i - insertIndex);
            array[insertIndex] = temp;
        }
    }

    public static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        checkNullArg(array1);
        checkNullArg(array2);
        int ar1Length = array1.length;
        int ar2Length = array2.length;
        if (ar1Length == 0)
            return array2;
        if (ar2Length == 0)
            return array1;
        int resultLength = ar1Length + ar2Length;
        int[] result = new int[resultLength];
        while (resultLength-- > 0) {
            result[resultLength] = array1[ar1Length - 1] > array2[ar2Length - 1] ? array1[ar1Length-- - 1] : array2[ar2Length-- - 1];
            if (ar1Length < 1) {
                System.arraycopy(array2, 0, result, 0, resultLength);
                break;
            }
            if (ar2Length < 1) {
                System.arraycopy(array1, 0, result, 0, resultLength);
                break;
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] m1, int[][] m2) {
        int columns = m1.length;
        int rows = m2[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result [i][j] = multiplyVector(getColumn(m2, j), getRow(m1, i));
            }
        }
        return result;
    }

    private static int[] getColumn(int[][] matrix, int columnArg) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        int[] result = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (columnArg == j) {
                    result[i] = matrix[i][j];
                }
            }
        }
        return result;
    }

    private static int[] getRow(int[][] matrix, int index) {
        return matrix[index];
    }

    private static int multiplyVector(int[] m1, int[] m2) throws RuntimeException {
        if (m1.length != m2.length) {
            throw new RuntimeException("Matrix can not be multiplied");
        }
        int rows = m1.length;
        int result = 0;
        for (int i = 0; i < rows; i++) {
            result+= m1[i] * m2[i];
        }
        return result;
    }

    private static void checkNullArg(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array for sort must be not null");
        }
    }
}
