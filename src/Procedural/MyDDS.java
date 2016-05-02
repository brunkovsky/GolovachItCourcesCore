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
        Node tail = new Node((int)(Math.random() * 10), null);
        Node head = tail;
        for (int i = size - 1; i > 0; i--) {
            head.next = new Node((int)(Math.random() * 10), null);
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

    public static Node copy(Node node) {
        return node == null ? null : new Node(node.value, node.next);
    }
}
