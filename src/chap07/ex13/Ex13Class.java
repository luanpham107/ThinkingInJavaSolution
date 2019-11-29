package chap07.ex13;

import chap07.ex08.Ex08Class;

class Ex13ClassBase {
    void method(){
        System.out.println("Base class: method - no arg");
    }

    void method(int i){
        System.out.println("Base class: method - 1 arg");
    }

    void method (int x, int y) {
        System.out.println("Base class: method - 2 args");
    }
}

public class Ex13Class extends Ex13ClassBase {
    void method(int x, int y, int z){
        System.out.println("Derived class: method - 3 args");
    }

    public static void main(String[] args) {
        Ex13Class ex13 = new Ex13Class();
        ex13.method();
        ex13.method(1);
        ex13.method(1,2);
        ex13.method(1,2,3);
    }
}