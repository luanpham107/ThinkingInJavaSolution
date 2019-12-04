package chap11HoldingYourObject.ex12;

import java.util.*;

public class Ex12Class {

    public static void main(String[] args) {
        List<Integer> listInt1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> listInt2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));

        ListIterator<Integer> lit1 = listInt1.listIterator();
        ListIterator<Integer> lit2 = listInt2.listIterator();
        while(lit1.hasNext()){
            lit1.next();
        }
        while(lit2.hasNext()) {
            lit2.next();
        }
        for(int i = 0; i < listInt1.size(); i++)
            lit2.add(lit1.previous());
        System.out.println("List1: " + listInt1);
        System.out.println("List2: " + listInt2);

    }
}
