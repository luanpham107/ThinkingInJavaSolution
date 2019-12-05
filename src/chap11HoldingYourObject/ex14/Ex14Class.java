package chap11HoldingYourObject.ex14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14Class {
    public void addMiddle(LinkedList<Integer> list, int i){
        ListIterator it =  list.listIterator(list.size()/2);
        it.add(i);
    }
    public static void main(String[] args) {
        Ex14Class ex14 = new Ex14Class();
        LinkedList<Integer> linkListInt = new LinkedList<Integer>();
        linkListInt.add(0);
        linkListInt.add(1);
        linkListInt.add(2);
        ex14.addMiddle(linkListInt, 10);
        ex14.addMiddle(linkListInt, 9);
        ex14.addMiddle(linkListInt, 7);
        System.out.println(linkListInt);
    }
}
