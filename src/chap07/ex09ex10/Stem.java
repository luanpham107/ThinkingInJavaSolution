package chap07.ex09ex10;

public class Stem extends Root {
    Stem(int i){
        super(i);
        System.out.println("This is constructor of Stem");
    }

    Component1 cp1 = new Component1(9);
    Component2 cp2 = new Component2(9);
    Component3 cp3 = new Component3(9);

    public static void main(String[] args) {
        Stem a = new Stem(1);
    }
}
