package chap11HoldingYourObject.ex17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    public int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println("gerbilNumber = " + gerbilNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(gerbilNumber);
    }

    public static void main(String[] args) {
        Map<String, Gerbil> mapGer = new HashMap<>();
        mapGer.put("One", new Gerbil(1));
        mapGer.put("Two", new Gerbil(2));
        mapGer.put("Three", new Gerbil(3));
        mapGer.put("Four", new Gerbil(4));
        mapGer.put("Five", new Gerbil(5));
        Iterator<String> it = mapGer.keySet().iterator();
        System.out.println(mapGer.keySet() + " : " + mapGer.values());

        while(it.hasNext()){
            String s = it.next();
            System.out.print(s + " : ");
            mapGer.get(s).hop();
        }
    }
}
