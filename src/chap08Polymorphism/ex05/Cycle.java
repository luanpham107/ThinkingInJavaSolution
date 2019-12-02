/*
* Polymorphism example in java
* */

package chap08Polymorphism.ex05;

class UniCycle extends Cycle {
    UniCycle(String name, int wheel) {
        super(name, wheel);
    }
}

class BiCycle  extends Cycle {
    BiCycle(String name, int wheel) {
        super(name, wheel);
    }
}

class TriCycle  extends Cycle {
    TriCycle(String name, int wheel) {
        super(name, wheel);
    }
}

public class Cycle {
    String name;
    int wheel;
    Cycle(String name, int wheel){
        this.name = name;
        this.wheel = wheel;
    }

    void ride(Cycle c){
        System.out.println("You know to ride a " + c.name);
        wheels(c);
    }

    void wheels(Cycle c){
        System.out.println("Number of wheels: " + c.wheel);
    }

    public static void main(String[] args) {
        UniCycle uni = new UniCycle("Unicycle", 1);
        BiCycle bi = new BiCycle("BiCycle", 2);
        TriCycle tri = new TriCycle("TriCycle", 3);
        Cycle cycle = new Cycle("Cycle", 2);
        cycle.ride(uni);
        cycle.ride(bi);
        cycle.ride(tri);
    }
}
