package chap11HoldingYourObject.ex01;

import java.util.ArrayList;

public class Gerbil {
    public int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("gerbilNumber = " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> arrGer = new ArrayList<Gerbil>();
        for(int i = 0; i < 3; i++){
            arrGer.add(new Gerbil(i));
        }
        for (Gerbil i : arrGer)
            i.hop();
    }
}
