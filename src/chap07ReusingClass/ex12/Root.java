package chap07ReusingClass.ex12;

class Component1 {
    Component1(int i){
        System.out.println("This is constructor of component 1");

    }
    public void dispose(){
        System.out.println("Component 1 dispose!");
    }
}

class Component2 {
    Component2(int i){
        System.out.println("This is constructor of component 2");
    }
    void dispose(){
        System.out.println("Component 2 dispose!");
    }
}

class Component3 {
    Component3(int i){
        System.out.println("This is constructor of component 3");
    }
    void dispose(){
        System.out.println("Component 3 dispose!");
    }
}

public class Root {
    Root(int i){
        System.out.println("This is constructor of Root");
    }
    Component1 cp1 = new Component1(1);
    Component2 cp2 = new Component2(1);
    Component3 cp3 = new Component3(1);

    void dispose(){
        cp1.dispose();
        cp2.dispose();
        cp3.dispose();
        System.out.println("Root dispose");
    }
}
