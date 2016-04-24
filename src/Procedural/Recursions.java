package Procedural;

public class Recursions {
    private static int depth = 0;

    public static void func(int i) {
        in();
        if (check(i)) {
            func(2 * i);
        }
        out();
    }

    private static boolean check(int i) {
        spaces();
        System.out.print(" (" + i + " < 15): ");
        if (i < 15) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private static void in() {
        depth++;
        spaces();
        System.out.println("" + depth + "->");
    }

    private static void out() {
        spaces();
        System.out.println("<-" + depth);
        depth--;
    }

    private static void spaces() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
    }

    public static int fibonacci(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("arg can not be negative, but = " + i);
        }
        if (i < 2) {
            return abc(i);
        } else {
            return a(i) + fibonacci(i - 2) + b(i) + fibonacci(i - 1) + c(i);
        }
    }

    private static int a(int i) {
        System.out.print("(");
        return 0;
    }

    private static int b(int i) {
        System.out.print("+");
        return 0;
    }

    private static int c(int i) {
        System.out.print(")");
        return 0;
    }

    private static int abc(int i) {
        System.out.print(i);
        return i;
    }

    public static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("arg can not be negative, but = " + i);
        }
        if (i < 2) {
            return 1;
        }
        return factorial(i - 1) * i;
    }

    // print a row from 0 to i
    public static void row(int i) {
        if (--i > 0) {
            row(i);
        }
        System.out.print((i + 1) + " ");
    }

    // print a row from a to b
    public static void rowExt(int a, int b) {
        if (a >= b) {
            System.out.print((a) + " ");
            if (--a >= b) {
                rowExt(a, b);
            }
        } else {
            System.out.print((a) + " ");
            if (++a <= b) {
                rowExt(a, b);
            }
        }
    }

    // return a value of Accerman function
    public static int accermanFunction(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return accermanFunction(m - 1, 1);
        } else {
            return accermanFunction(m - 1, accermanFunction(m, n - 1));
        }
    }

    // is argument = pow of two
    public static boolean isPow2(int i) {
        if (i % 2 == 0) {
            return isPow2(i / 2);
        } else {
            return i == 1;
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return;
        }

    }
}
