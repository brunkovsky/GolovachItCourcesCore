package Procedural;

import java.util.Arrays;

public class MyArrays {

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

    private static void checkNullArg(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array for sort must be not null");
        }
    }
}
