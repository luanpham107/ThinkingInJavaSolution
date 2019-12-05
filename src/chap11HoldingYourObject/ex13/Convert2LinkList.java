package chap11HoldingYourObject.ex13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Pet {
    String name;
    int numOfFoot;
    Pet(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

public class Convert2LinkList {
    public static void main(String[] args) {
        LinkedList<Pet> linkListFloat = new LinkedList<Pet>();
        linkListFloat.offer(new Pet("Dog"));
        linkListFloat.addFirst(new Pet("Cat"));
        System.out.println(linkListFloat);
        linkListFloat.addLast(new Pet("Hamster"));

        Iterator it = linkListFloat.iterator();
        ListIterator it2 = linkListFloat.listIterator();
        System.out.println(linkListFloat);
        linkListFloat.removeFirst();


    }
}
