/*
* Polymorphism example in java
* */

package chap08Polymorphism.ex01;

class UniCycle extends Cycle {
    UniCycle(String name) {
        super(name);
    }
}

class BiCycle  extends Cycle {
    BiCycle(String name) {
        super(name);
    }
}

class TriCycle  extends Cycle {
    TriCycle(String name) {
        super(name);
    }
}

public class Cycle {
    String name;
    Cycle(String name){
        this.name = name;
    }

    void ride(Cycle c){
        System.out.println("You know to ride a " + c.name);
    }

    public static void main(String[] args) {
        UniCycle uni = new UniCycle("Unicycle");
        BiCycle bi = new BiCycle("BiCycle");
        TriCycle tri = new TriCycle("TriCycle");
        Cycle cycle = new Cycle("Cycle");
        cycle.ride(uni);
        cycle.ride(bi);
        cycle.ride(tri);
    }
}
