package chap11HoldingYourObject.ex18;

import java.util.*;

public class Ex18Class {
    int num;
    String name;
    public Ex18Class(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Map<String, Ex18Class> hashMap = new HashMap<String, Ex18Class>();
       hashMap.put("One", new Ex18Class("Dog"));
        hashMap.put("Two", new Ex18Class("Cat"));
        hashMap.put("Three", new Ex18Class("Mew"));
        hashMap.put("Four", new Ex18Class("Pikachu"));
        hashMap.put("Five", new Ex18Class("Snake"));

        System.out.println(hashMap.keySet());
        Set<String> softedKey = new TreeSet<String>(hashMap.keySet());
        System.out.println(softedKey);

        // Place result inside new LinkHashMap
        Map<String, Ex18Class> sorted = new LinkedHashMap<String, Ex18Class>();
        for(String s : softedKey){
            sorted.put(s, hashMap.get(s));
        }

        // Print again to check sort list
        System.out.println(sorted.values());
    }
}
