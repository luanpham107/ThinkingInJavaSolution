package chap11HoldingYourObject.ex09;

import java.util.ArrayList;
import java.util.Iterator;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;
    public Sequence(int size) { items = new ArrayList<Object>(size); }
    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(i);
        sequence.add("One");
        sequence.add("Two");
        sequence.add("Three");

        Iterator it = sequence.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}