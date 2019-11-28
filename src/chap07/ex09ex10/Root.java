package chap07.ex09ex10;

class Component1 {
    Component1(int i){
        System.out.println("This is constructor of component 1");
    }
}

class Component2 {
    Component2(int i){
        System.out.println("This is constructor of component 2");
    }
}

class Component3 {
    Component3(int i){
        System.out.println("This is constructor of component 3");
    }
}

public class Root {
    Root(int i){
        System.out.println("This is constructor of Root");
    }
    Component1 cp1 = new Component1(1);
    Component2 cp2 = new Component2(1);
    Component3 cp3 = new Component3(1);
}
