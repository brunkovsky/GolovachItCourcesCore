package Procedural;

public class SingleLLUtils_2 {
    public static Node add(Node node, int place, int newValue) {
        Node cursor = node;
        for (int i = 0; i < place; i++) {
            cursor = cursor.next;
        }
        Node newNode = new Node(newValue, node.next);
        node.next = newNode;
        return node;
    }
}
