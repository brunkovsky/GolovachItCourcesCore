package Procedural;

public class MainDDS {
    public static void main(String[] args) {
//        Node iter0 = MyDDS.generateIter0(8);
        Node iter1 = MyDDS.generateIter1(3);
//        Node recu0 = MyDDS.generateRecu0(8);
//        Node recu1 = MyDDS.generateRecu1(9);

//        System.out.println(MyDDS.toStringIter(iter0));
        System.out.println(MyDDS.toStringRec(iter1));
//        System.out.println(MyDDS.toStringIter(recu0));
//        System.out.println(MyDDS.toStringRec(recu1));
//        System.out.println("Size = " + MyDDS.getLength(iter1));
//        System.out.println("Sum = " + MyDDS.getSum(iter1));
        System.out.println("Max = " + MyDDS.getMax(iter1));
//        System.out.println("Min = " + MyDDS.getMin(iter1));
    }
}
