package chap08Polymorphism.ex08;

import java.util.Random;

public class RandomGenerator {
    private Random rand = new Random(System.currentTimeMillis());
    public Instrument next(){
        int i = rand.nextInt(5);
        switch (i){
            default:
            case 0: { return new Wind(); }
            case 1: { return new Percussion();}
            case 2: { return new Stringed();}
            case 3: { return new Brass(); }
            case 4: { return new Woodwind(); }
            case 5: { return new Guitar(); }
        }
    }
}
