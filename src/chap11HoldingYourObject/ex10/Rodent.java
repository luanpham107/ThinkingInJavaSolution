package chap11HoldingYourObject.ex10;

import java.util.ArrayList;
import java.util.Iterator;

public class Rodent {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>();
        rodents.add(new Mouse());
        rodents.add(new Gerbil());
        rodents.add(new Hamster());


        Iterator<Rodent> it = rodents.iterator();
       while(it.hasNext())
           it.next().commonMethod();
    }

    public void commonMethod() {
        System.out.println("Rodent: Common method");
    }

    public void method2() {
        System.out.println("Rodent: Medtho2");
    }
}

class Mouse extends Rodent {
    @Override
    public void commonMethod(){
        System.out.println("Mouse");
    }
}

class Gerbil extends Rodent {
    @Override
    public void commonMethod(){
        System.out.println("Gerbil");
    }
}

class Hamster extends Rodent {
    @Override
    public void commonMethod(){
        System.out.println("Hamster");
    }
}

//ex10
class Dui extends Rodent {
    @Override
    public void method2(){
        System.out.println("Derived Dui: Method 2");
    }
}


