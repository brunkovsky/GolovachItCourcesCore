package Procedural;

public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void remove(int element) {
//        Node node = this;
//        while (--element > 0) {
//            node = node.next;
//        }
        Node node = this;
        node = node.next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + this.next.value +
                '}';
    }
}
