package Procedural;

import java.util.Arrays;
import java.util.Stack;

public class MainRecursion {
    public static void main(String[] args) {
//        Recursions.func(1);
//        System.out.println("\nFibonacci of 7 = " + Recursions.fibonacci(7));
//        System.out.println(Recursions.factorial(5));
//        Recursions.row(7);
//        Recursions.rowExt(7, 10);
//        System.out.println(Recursions.accermanFunction(2, 2));
//        System.out.println(Recursions.isPow2(7));
//        int[] array = {4,6,22,5,-8,-55,5,5,3,3,5,67,8,9,43654,6,45,65,22,664,0};
//        System.out.println("Original array: " + Arrays.toString(array));
//        Recursions.mergeSort(array);
//        System.out.println("Sorted array: " + Arrays.toString(array));
//        int[] arr = {1,2,3};
//        Recursions.permutation(arr, arr.length);

//        Stack<Integer> from = new Stack<>();
//        Stack<Integer> help = new Stack<>();
//        Stack<Integer> to = new Stack<>();
//        for (int i = 20; i > 0; i--) {
//            from.push(i);
//        }
//        System.out.print("before:  ");
//        System.out.print("  from: " + from);
//        System.out.print("  help: " + help);
//        System.out.print("  to: " + to);
//        System.out.println();
//        Recursions.exchange(from, help, to, from.size());
//        System.out.print("after:  ");
//        System.out.print("  from: " + from);
//        System.out.print("  help: " + help);
//        System.out.print("  to: " + to);

//        System.out.println(Recursions.eval("(1+3)*5"));

        int[] ar1 = {7,5,6,10};
        int[] ar2 = Recursions.quickSort(ar1);
        System.out.println(Arrays.toString(ar2));
    }
}
