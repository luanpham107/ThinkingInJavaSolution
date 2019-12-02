package chap08Polymorphism.ex08;

/*
* Modify what method to be call as toString
*/
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
    @Override
    public String toString() {
        return what();
    }
}

class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    String what() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    String what() { return "Woodwind"; }
}

class Guitar extends Instrument {
    void play(Note n) {
        System.out.println("Guitar.play() " + n);
    }
    String what() {return "Guitar"; }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
// ...
        System.out.println(i);
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        RandomGenerator rd = new RandomGenerator();
        Instrument[] orchestra = new Instrument[12];
        for(int i = 0; i < orchestra.length; i++){
            orchestra[i] = rd.next();
        }
        tuneAll(orchestra);
    }
}
