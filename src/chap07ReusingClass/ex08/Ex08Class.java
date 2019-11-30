package chap07ReusingClass.ex08;

class Ex08ClassBase {
    Ex08ClassBase(int x){
        System.out.println("Ex08ClassA base constructor: " + x);
    }
}

public class Ex08Class extends Ex08ClassBase{

    Ex08Class(int x){
        super(0);
        System.out.println("Derived no arg constructor");
    }

    Ex08Class(){
        super(0);
        System.out.println("Derived constructor");
    }
    public static void main(String[] args) {
        Ex08Class a = new Ex08Class(0);
        Ex08Class b = new Ex08Class();
    }
}
