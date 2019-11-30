package chap07ReusingClass.ex12;

public class Stem extends Root {
    Component1 cp1;
    Component2 cp2;
    Component3 cp3;
    Stem(int i){
        super(i);
        cp1 = new Component1(9);
        cp2 = new Component2(9);
        cp3 = new Component3(9);
        System.out.println("This is constructor of Stem");
    }

    void dispose(){
        cp1.dispose();
        cp2.dispose();
        cp3.dispose();
        System.out.println("Stem dispose");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem a = new Stem(1);
        try{

        }
        finally {
            a.dispose();
        }
    }
}
