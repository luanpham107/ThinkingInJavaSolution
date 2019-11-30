package chap07ReusingClass.ex18;

import java.util.Random;
// Test static and static final
public class FinalClass {
    private static Random rand = new Random(50);
    static int x = 9;
    final int y = rand.nextInt(50);
    static final int z = rand.nextInt(50);

    FinalClass(){
    }
    void show(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    public static void main(String[] args) {
        FinalClass[] f = new FinalClass[3];
        for (FinalClass i : f){
            i = new FinalClass();
            i.show();
        }
    }

}
