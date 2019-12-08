package chap11HoldingYourObject.ex23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m =
                new HashMap<Integer,Integer>();
        for(int i = 0; i < 10000; i++) {
// Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);

        Map<Integer, Integer> listInt = new HashMap<Integer, Integer>();
        Iterator<Integer> itNew = listInt.values().iterator();
        Iterator<Integer> it = m.values().iterator();
        while(it.hasNext()){
            int x = it.next();
            if(listInt.keySet().contains(x)){
                int y = listInt.get(x).intValue();
                listInt.put(x, y + 1);
            }
            else{
                listInt.put(x, 1);
            }
        }
        System.out.println("After process: " + listInt);
    }
}

