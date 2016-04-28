package Procedural;

import java.util.Arrays;
import java.util.Stack;

public class Recursions {
//    private static int depth = 0;

//    public static void func(int i) {
//        in();
//        if (check(i)) {
//            func(2 * i);
//        }
//        out();
//    }

//    private static boolean check(int i) {
//        spaces();
//        System.out.print(" (" + i + " < 15): ");
//        if (i < 15) {
//            System.out.println("true");
//            return true;
//        } else {
//            System.out.println("false");
//            return false;
//        }
//    }

//    private static void in() {
//        depth++;
//        spaces();
//        System.out.println("" + depth + "->");
//    }

//    private static void out() {
//        spaces();
//        System.out.println("<-" + depth);
//        depth--;
//    }

//    private static void spaces() {
//        for (int i = 0; i < depth; i++) {
//            System.out.print("  ");
//        }
//    }

//    public static int fibonacci(int i) {
//        if (i < 0) {
//            throw new IllegalArgumentException("arg can not be negative, but = " + i);
//        }
//        if (i < 2) {
//            return abc(i);
//        } else {
//            return a(i) + fibonacci(i - 2) + b(i) + fibonacci(i - 1) + c(i);
//        }
//    }

//    private static int a(int i) {
//        System.out.print("(");
//        return 0;
//    }

//    private static int b(int i) {
//        System.out.print("+");
//        return 0;
//    }

//    private static int c(int i) {
//        System.out.print(")");
//        return 0;
//    }

//    private static int abc(int i) {
//        System.out.print(i);
//        return i;
//    }

//    public static int factorial(int i) {
//        if (i < 0) {
//            throw new IllegalArgumentException("arg can not be negative, but = " + i);
//        }
//        if (i < 2) {
//            return 1;
//        }
//        return factorial(i - 1) * i;
//    }

    // print a row from 0 to i
//    public static void row(int i) {
//        if (--i > 0) {
//            row(i);
//        }
//        System.out.print((i + 1) + " ");
//    }

    // print a row from a to b
//    public static void rowExt(int a, int b) {
//        if (a >= b) {
//            System.out.print((a) + " ");
//            if (--a >= b) {
//                rowExt(a, b);
//            }
//        } else {
//            System.out.print((a) + " ");
//            if (++a <= b) {
//                rowExt(a, b);
//            }
//        }
//    }

    // return a value of Accerman function
//    public static int accermanFunction(int m, int n) {
//        if (m == 0) {
//            return n + 1;
//        }
//        if (m > 0 && n == 0) {
//            return accermanFunction(m - 1, 1);
//        } else {
//            return accermanFunction(m - 1, accermanFunction(m, n - 1));
//        }
//    }

    // is argument = pow of two
//    public static boolean isPow2(int i) {
//        if (i % 2 == 0) {
//            return isPow2(i / 2);
//        } else {
//            return i == 1;
//        }
//    }

//    public static void mergeSort(int[] array) {
//        if (array.length == 0 || array.length == 1) {
//            return;
//        }
//    }

//    public static void permutation(int[] arr, int size) {
//        if (size == 1) {
//            System.out.println(Arrays.toString(arr));
//        } else {
//            for (int k = 0; k < size; k++) {
//                swap(arr, k, size - 1);
//                permutation(arr, size - 1);
//            }
//        }
//    }

//    private static void swap(int[] arr, int k, int i) {
//        if (k == i) {
//            return;
//        }
//        int temp = arr[k];
//        arr[k] = arr[i];
//        arr[i] = temp;
//    }


//    public static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
//        if (count > 0) {
//            exchange(from, to, help, --count);
//            to.push(from.pop());
//            exchange(help, from, to, count);
//        }
//    }

//    public static int eval(String expr) {
//        return eval(expr, 0, expr.length());
//    }

//    private static int eval(String expr, int from, int to) {
//        if (expr.charAt(from) == '(') {
//            return eval(expr, from + 1, to - 1);
//        } else {
//            int pos = from;
//            while (pos < to) {
//                if (Character.isDigit(expr.charAt(pos))) {
//                    pos++;
//                } else {
//                    int leftOperand = Integer.valueOf(expr.substring(from, pos));
//                    char operation = expr.charAt(pos);
//                    int rightOperand = eval(expr, pos + 1, to);
//                    switch (operation) {
//                        case '+':
//                            return leftOperand + rightOperand;
//                        case '-':
//                            return leftOperand - rightOperand;
//                        case '*':
//                            return leftOperand * rightOperand;
//                        case '/':
//                            return leftOperand / rightOperand;
//                    }
//                }
//            }
//            return Integer.valueOf(expr.substring(from, to));
//        }
//    }

    public static int[] quickSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        if (array.length == 2) {
            int max = array[0] >= array[1] ? array[0] : array[1];
            int min = array[0] < array[1] ? array[0] : array[1];
            array[0] = min;
            array[1] = max;
            return array;
        }
        if (array.length > 2) {
            int pivot = array[0];
            int leftArrayLength = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= pivot) {
                    leftArrayLength++;
                }
            }
            int rightArrayLength = array.length - leftArrayLength;
            int[] left = new int[leftArrayLength];
            int[] right = new int[rightArrayLength];

            for (int i = 0; i < array.length; i++) {
                if (array[i] <= pivot) {
                    left[leftArrayLength-- - 1] = array[i];
                } else {
                    right[rightArrayLength-- - 1] = array[i];
                }
            }
            return MyArrays.mergeTwoSortedArrays(quickSort(left), quickSort(right));
        }
        return null;
    }
}
