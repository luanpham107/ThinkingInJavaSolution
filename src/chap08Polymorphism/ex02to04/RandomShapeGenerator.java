package chap08Polymorphism.ex02to04;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(System.currentTimeMillis());
    public Shape next() {
        int i = rand.nextInt(4);
//        System.out.println("Rand value = " + i);
        switch(i) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}