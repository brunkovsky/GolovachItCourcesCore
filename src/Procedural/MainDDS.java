package Procedural;

public class MainDDS {
    public static void main(String[] args) {
        Node iter0 = MyDDS.generateIter0(4);

        System.out.println(MyDDS.toStringRec(iter0));
//        MyDDS.showRecu(tail);
    }
}
