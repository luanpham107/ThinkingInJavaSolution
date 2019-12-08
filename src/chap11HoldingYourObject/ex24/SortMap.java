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
    public static void printMap(Map<String,Animal> map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        while ( it.hasNext() ) {
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Animal value = (Animal) entry.getValue();
            System.out.println(key + " => " + value);
        }//while
        System.out.println("========================");
    }//printMap

    public static void main(String[] args) {
        Map<String, Animal> m = new LinkedHashMap<String, Animal>();
        m.put("One", new Animal("Dog", 4));
        m.put("Two", new Animal("Book", 0));
        m.put("Three", new Animal("Mew", 4));
        m.put("Four", new Animal("Cat", 4));
        m.put("Five", new Animal("Dragon", 2));

        List<String> list = new ArrayList<String>();
        Iterator<String> it = m.keySet().iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        System.out.println("Seperate List: " + list);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted List: " + list);
        Map<String, Animal> treeMap = new TreeMap<String, Animal>(m);
        printMap(treeMap);
    }
}
