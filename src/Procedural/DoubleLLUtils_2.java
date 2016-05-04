package Procedural;

public class DoubleLLUtils_2 {
    public static int getLength(DNode dNode) {
//        int result = 0;
//        while (dNode != null) {
//            result++;
//            dNode = dNode.next;
//        }
//        return result;
        return dNode == null ? 0 : 1 + getLength(dNode.next);

    }

    public static void remove(DNode dNode, int i) {
        DNode cursor = dNode;
        for (int j = 0; j < i; j++) {
            cursor = cursor.next;
        }
//        System.out.println(cursor);
        cursor.next.prev = cursor.prev;
        cursor.prev.next = cursor.next;
    }
}
