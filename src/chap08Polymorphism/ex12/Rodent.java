package chap08Polymorphism.ex12;

public class Rodent {
    Rodent(){
        System.out.println("Rodent constructor");
    }
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
        Rodent dui = new Dui();
        dui.method2();

        System.out.println("Ex12: Demonstrate the order of initialization");
    }
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Mouse");
    }
}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Gerbil constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Gerbil");
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Hamster constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Hamster");
    }
}

//ex10
class Dui extends Rodent {
    Dui() {
        System.out.println("Dui constructor");
    }
    @Override
    public void method2(){
        System.out.println("Derived Dui: Method 2");
    }
}


