package Procedural;

import java.util.List;

public class MainDDS {
    public static void main(String[] args) {
//        Node iter0 = MyDDS.generateIter0(8);
//        Node iter1 = MyDDS.generateIter1(5);
//        Node recu0 = MyDDS.generateRecu0(8);
//        Node recu1 = MyDDS.generateRecu1(9);

//        System.out.println(MyDDS.toStringIter(iter0));
//        System.out.println(MyDDS.toStringRec(iter1));
//        System.out.println(MyDDS.toStringIter(recu0));
//        System.out.println(MyDDS.toStringRec(recu1));
//        System.out.println("Len = " + SingleLLUtils_1.getLength(iter1));
//        System.out.println("Sum = " + SingleLLUtils_1.getSum(iter1));
//        System.out.println("Max = " + SingleLLUtils_1.getMax(iter1));
//        System.out.println("Min = " + SingleLLUtils_1.getMin(iter1));
//        Node iter2 = SingleLLUtils_2.add(iter1, 0, 88);
//        System.out.println(MyDDS.toStringRec(iter2));
//        Node iter3 = SingleLLUtils_2.remove(iter2, 5);
//        System.out.println(MyDDS.toStringRec(iter3));
//        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, new TreeNode(-4, null, new TreeNode(5, null, null)), null));
        TreeNode root = new TreeNode(1, new TreeNode(1, null, null), new TreeNode(1, null, null));
        System.out.println(root);
        System.out.println("Size = " + TreeNodeUtils_1.getSize(root));
        System.out.println("Height = " + TreeNodeUtils_1.getHeight(root));
        System.out.println("Sum = " + TreeNodeUtils_1.getSum(root));
        System.out.println("Max = " + TreeNodeUtils_1.getMax(root));
        System.out.println("Min = " + TreeNodeUtils_1.getMin(root));
    }
}
