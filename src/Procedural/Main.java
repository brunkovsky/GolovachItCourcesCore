package Procedural;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] array = {3,7,-6,2,2,0,553,3,-563};
//        System.out.println("Original array: " + Arrays.toString(array));
//        MyArrays.bubbleSort(array);
//        System.out.println("Bubble sorted array: " + Arrays.toString(array));
//
//        System.out.println();
//
//        int[] array2 = {-5,44,63,332,25,-754,44,53,-5,5,3,4,3,4};
//        System.out.println("Original array: " + Arrays.toString(array2));
//        MyArrays.bubbleSortInvert(array2);
//        System.out.println("Invert bubble sorted array: " + Arrays.toString(array2));
//
//        System.out.println();
//
        int[] array3 = {-6,3,-5,-6,-8,-9,-0,1,11,4};
//        System.out.println("Original array: " + Arrays.toString(array3));
        MyArrays.insertionSort(array3);
//        System.out.println("Insertion sorted array: " + Arrays.toString(array3));
//
//        System.out.println();
//
        int[] array4 = {4,5,6,7,8,2,1,2,3,1,3,5,3,2,0,2,2,0,0,4,5,3,4};
//        System.out.println("Original array: " + Arrays.toString(array4));
        MyArrays.insertionSortExtended(array4);
//        System.out.println("Extended insertion sorted array: " + Arrays.toString(array4));
//
//        System.out.println();

        System.out.println("First array: " + Arrays.toString(array3));
        System.out.println("Second array: " + Arrays.toString(array4));
        int[] array5 = MyArrays.mergeTwoSortedArrays(array3, array4);
        System.out.println("Merged array from two sorted: " + Arrays.toString(array5));
    }
}
