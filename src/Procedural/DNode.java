package Procedural;

public class DNode {
    public int value;
    public DNode prev;
    public DNode next;

    public DNode(int value, DNode prev, DNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "value=" + value +
                ", prev=" + (prev == null ? "null" : prev.value) +
                ", next=" + (next == null ? "null" : next.value) +
                '}';
    }
}
