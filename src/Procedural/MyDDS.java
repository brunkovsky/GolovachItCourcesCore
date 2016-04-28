package Procedural;

public class MyDDS {

    public static Node generateIter0(int size) {
        Node result = null;
        for (int i = 0; i <= size; i++) {
            result = new Node(i, result);
        }
        return result;
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
}
