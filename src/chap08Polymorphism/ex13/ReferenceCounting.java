package chap08Polymorphism.ex13;

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

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        shared.finalize();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        shared.finalize();
        for(Composing c : composing)
            c.dispose();
        shared.finalize();
    }
}