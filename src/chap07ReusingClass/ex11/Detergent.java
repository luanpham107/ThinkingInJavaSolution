package chap07ReusingClass.ex11;

//: reusing/Detergent.java
// Inheritance syntax & properties.
class Cleanser {
    private String s = "Cleanser";

//    public static void main(String[] args) {
//        Cleanser x = new Cleanser();
//        x.dilute(); x.apply(); x.scrub();
//        System.out.println(x);
//    }

    public void append(String a) { s += a; }

    public void dilute() { append(" dilute()"); }

    public void apply() { append(" apply()"); }

    public void scrub() { append(" scrub()"); }

    public String toString() { return s; }
}

public class Detergent extends Cleanser {
    private Cleanser detergenDelegation = new Cleanser();



    // Change a method:
    public void scrub() {
        detergenDelegation.scrub();
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
//        Cleanser.main(args);
        System.out.println("Testing ExDetergen");
        ExDetergent y = new ExDetergent();
        y.scrub();
        System.out.println(y.toString());
    }
}

class ExDetergent extends Detergent {
    public void scrub(){
        append(" ExDetergent modified scrub");
//        this.scrub();
    }
}