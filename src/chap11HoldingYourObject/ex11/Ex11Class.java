package chap11HoldingYourObject.ex11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex11Class {

    public void interatorPrint(Collection collection){
        Iterator it = collection.iterator();
        while(it.hasNext())
            System.out.print(it.next().toString());
        System.out.println();
    }

    public static void main(String[] args) {
        Ex11Class ex11 = new Ex11Class();

        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        LinkedList<Integer> linkInt = new LinkedList<Integer>();

        for(int i = 0; i< 10;  i++){
            arrInt.add(i);
        }

        for(int i = 10; i< 20;  i++){
            linkInt.add(i);
        }

        ex11.interatorPrint(arrInt);
        ex11.interatorPrint(linkInt);
    }
}
