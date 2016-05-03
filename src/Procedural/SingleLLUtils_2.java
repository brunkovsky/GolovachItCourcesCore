package Procedural;

public class SingleLLUtils_2 {
    public static Node add(Node node, int place, int newValue) {
        if (place == 0) {
            return new Node(newValue, node);
        } else {
            Node cursor = node;
            for (int i = 0; i < place - 1; i++) {
                cursor = cursor.next;
            }
            cursor.next = new Node(newValue, cursor.next);
            return node;
        }
    }

    public static Node remove(Node node, int place) {
        if (place == 0) {
            return node.next;
        } else {
            Node cursor = node;
            for (int i = 0; i < place - 1; i++) {
                cursor = cursor.next;
            }
            cursor.next = cursor.next.next;
        }
        return node;
    }
}
