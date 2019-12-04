package chap11HoldingYourObject.ex08;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil {
    public int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("gerbilNumber " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> arrGer = new ArrayList<Gerbil>();

        for(int i = 0; i < 3; i++){
            arrGer.add(new Gerbil(i));
        }

        Iterator<Gerbil> it = arrGer.iterator();
        while(it.hasNext())
            it.next().hop();
    }
}
