package chap07.ex05;

class A {
    A(){
        System.out.println("A constructor");
    }
}

class B {
    B(){
        System.out.println("B constructor");
    }
}

public class C extends A {
    B objB = new B();

    public static void main(String[] args) {
        C objC = new C();
    }
}
