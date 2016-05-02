package Procedural;

public class SingleLLUtils_1 {
    public static int getLength(Node node) {
        return node == null ? 0 : 1 + getLength(node.next);
    }

    public static int getSum(Node node) {
        return node == null ? 0 : node.value + getSum(node.next);
    }

    public static int getMax(Node node) {
        int max = node.value;
        if (node.next != null) {
            max = getMax(node.next);
        }
        return node.value > max ? node.value : max;
    }

    public static int getMin(Node node) {
        int min = node.value;
        if (node.next != null) {
            min = getMin(node.next);
        }
        return node.value < min ? node.value : min;
    }
}
