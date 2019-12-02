package chap08Polymorphism.ex09ex10;

public class Rodent {
    public void commonMethod() {
        System.out.println("Rodent: Common method");
    }

    public void method2() {
        System.out.println("Rodent: Medtho2");
    }

    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent i : rodents){
            i.commonMethod();
        }
        // Exercie 10
        Rodent dui = new Dui();
        dui.method2();

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


