package chap11HoldingYourObject.ex05ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<String> pets = new ArrayList<String>() {
            {
                add("One");
                add("Two");
                add("Three");
                add("Four");
            }
        };
        System.out.println("1: " + pets);
        String h = new String("Hamster");
        pets.add(h); // Automatically resizes
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h); // Remove by object
        String p = pets.get(0);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        String cymric = new String("Crymic");
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
// Must be the exact object:
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new String("Mouse")); // Insert at an index
        System.out.println("9: " + pets);
        List<String> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<String> copy = new ArrayList<String>(pets);
        sub = new ArrayList<String>() {
            {
                add("Sub One");
                add("Sub Two");
            }
        };
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(pets); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, new String("Mouse")); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear(); // Remove all elements
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.addAll(new ArrayList<String>() {
                        {
                            add("21 One");
                            add("21 Two");
                            add("21 Three");
                            add("21 Four");
                        }
                    }
        );
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        String[] pa = pets.toArray(new String[0]);
//        System.out.println("23: " + pa[3].id());
    }
}