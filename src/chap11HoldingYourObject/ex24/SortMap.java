package chap11HoldingYourObject.ex24;

import java.util.*;

class Animal {
    String name;
    int numOfFoot;
    Animal(String n, int f){
        name = n;
        numOfFoot = f;
    }

    @Override
    public String toString() {
        return name + " has " + numOfFoot;
    }
}

public class SortMap {

    public static void main(String[] args) {
        Map<String, Animal> m = new LinkedHashMap<String, Animal>();
        m.put("One", new Animal("Dog", 4));
        m.put("Two", new Animal("Book", 0));
        m.put("Three", new Animal("Mew", 4));
        m.put("Four", new Animal("Cat", 4));
        m.put("Five", new Animal("Dragon", 2));

        Set<String> ss = new TreeSet<String>(m.keySet());
        Iterator<String> it = ss.iterator();
        System.out.println("Before sorted: " + m);
        while(it.hasNext()){
            String s = (String)it.next();
            Animal _temp = m.get(s);
            m.remove(s);
            m.put(s, _temp);
        }
        System.out.println("After sorted: " + m);
    }
}
