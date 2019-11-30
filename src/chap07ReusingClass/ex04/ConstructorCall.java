package com.Chap07.ex04;

class Con01 {
    Con01()
    {
        System.out.println("Con01 constructor call!");
    }
}

public class ConstructorCall extends Con01 {
    ConstructorCall(){
        System.out.println("Constructor constructor call");
    }
    public static void main(String[] args) {
        //  Test which constructor is call first
        ConstructorCall cc = new ConstructorCall();
    }
}
