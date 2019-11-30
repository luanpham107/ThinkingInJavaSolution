package chap07ReusingClass.ex07;

class A {
    A(float t){
        System.out.println("A constructor");
    }
}

class B {
    B(float t){
        System.out.println("B constructor");
    }
}

public class C extends A {
    C(){
        super(0.0f);
    }
    B objB = new B(0.9f);

    public static void main(String[] args) {
        C objC = new C();
    }
}
