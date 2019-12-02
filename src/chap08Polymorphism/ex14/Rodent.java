package chap08Polymorphism.ex14;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }

    protected void finalize() {
        if(refcount > 1)
            System.out.println("You are have " + refcount + " objects to dispose");
        else if(refcount > 0)
            System.out.println("You are have " + refcount + " object to dispose");
        else
            System.out.println("You havd cleared all objects");
    }
}

class Mouse extends Rodent {
    Mouse(Shared share) {
        super(share);
        System.out.println("Mouse constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Mouse");
    }
}

class Gerbil extends Rodent {
    Gerbil(Shared share) {
        super(share);
        System.out.println("Gerbil constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Gerbil");
    }
}

class Hamster extends Rodent {
    Hamster(Shared share) {
        super(share);
        System.out.println("Hamster constructor");
    }
    @Override
    public void commonMethod(){
        System.out.println("Hamster");
    }
}

//ex10
class Dui extends Rodent {
    Dui(Shared share) {
        super(share);
        System.out.println("Dui constructor");
    }
    @Override
    public void method2(){
        System.out.println("Derived Dui: Method 2");
    }
}

public class Rodent {
    Rodent(Shared share){
        System.out.println("Rodent constructor");
        this.share = share;
        this.share.addRef();
    }
    Shared share;
    public void commonMethod() {
        System.out.println("Rodent: Common method");
    }
    public void method2() {
        System.out.println("Rodent: Medtho2");
    }
    protected void dispose(){
        share.dispose();
    }
    public static void main(String[] args) {
        Shared share = new Shared();
        Rodent[] rodents = {
                new Mouse(share),
                new Gerbil(share),
                new Hamster(share)
        };
        for(Rodent i : rodents){
            i.commonMethod();
        }
        Rodent dui = new Dui(share);
        dui.method2();
        share.finalize();
        for(Rodent i : rodents){
            i.dispose();
        }
        share.finalize();
        dui.dispose();
        share.finalize();
        System.out.println("Ex12: Demonstrate the order of initialization");
    }
}

