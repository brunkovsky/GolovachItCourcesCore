package Procedural;

public class MyDDS {

    public static Node generateIter0(int size) {
        Node result = null;
        for (int i = 0; i < size; i++) {
            result = new Node(i, result);
        }
        return result;
    }

    public static Node generateIter1(int size) {
        if (size == 0) {
            return null;
        }
        Node tail = new Node(size - 1, null);
        Node head = tail;
        for (int i = size - 1; i > 0; i--) {
            head.next = new Node(i - 1, null);
            head = head.next;
        }
        return tail;
    }

    public static Node generateRecu0(int size) {
        return size > 0 ? new Node(size - 1, generateRecu0(--size)) : null;
    }

    public static String toStringIter(Node node) {
        String result = "";
        while (node != null) {
            result += "(" + node.value + ")->";
            node = node.next;
        }
        result += "null";
        return result;
    }

    public static String toStringRec(Node node) {
        return node == null ? "null" : "(" + node.value + ")->" + toStringRec(node.next);
    }

    public static int getLength(Node node) {
//        int size = 0;
//        while (node != null) {
//            size = size + 1;
//            node = node.next;
//        }
//        return size;
        return node == null ? 0 : 1 + getLength(node.next);
    }

    public static int getSum(Node node) {
//        int sum = 0;
//        while (node != null) {
//            sum += node.value;
//            node = node.next;
//        }
//        return sum;
        return node == null ? 0 : node.value + getSum(node.next);
    }

    public static int getMax(Node node) {
//        if (node == null) {
//            throw new IllegalArgumentException("arg can not be null");
//        }
//        int max = node.value;
//        while (node != null) {
//            max = node.value > max ? node.value : max;
//            node = node.next;
//        }
//        return max;

        if (node.value > getMax(node.next)) {
            return node.value;
        } else {
            return node.value > node.next.value ? node.value : node.next.value;
        }
    }

    public static int getMin(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("arg can not be null");
        }
        int min = node.value;
        while (node != null) {
            min = node.value < min ? node.value : min;
            node = node.next;
        }
        return min;
    }

    public static Node copy(Node node) {
        return node == null ? null : new Node(node.value, node.next);
    }
}
