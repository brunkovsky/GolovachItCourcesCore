package Procedural;

import java.util.Arrays;

public class MainRecursion {
    public static void main(String[] args) {
//        Recursions.func(1);
//        System.out.println("\nFibonacci of 7 = " + Recursions.fibonacci(7));
//        System.out.println(Recursions.factorial(5));
//        Recursions.row(7);
//        Recursions.rowExt(7, 10);
//        System.out.println(Recursions.accermanFunction(2, 2));
//        System.out.println(Recursions.isPow2(7));
        int[] array = {4,6,22,5,-8,-55,5,5,3,3,5,67,8,9,43654,6,45,65,22,664,0};
        System.out.println("Original array: " + Arrays.toString(array));
        Recursions.mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
