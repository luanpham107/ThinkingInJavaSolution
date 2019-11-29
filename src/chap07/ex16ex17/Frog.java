package chap07.ex16ex17;

class Amphibian {
    Amphibian() {
        System.out.println("Amphibian constructor!");
    }

    static void testMethod1(Amphibian a) {
        System.out.println("Method 1 work");
    }

    static void testMethod2(Amphibian b) { // ex 17
        System.out.println("Method 2 work");
    }
}

public class Frog extends Amphibian {
    Frog(){
        super();
    }
     protected void testMethod2(int t){
         System.out.println("Overried method 2");
     }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.testMethod1(frog);
        Amphibian.testMethod2(frog); // Ex17
    }
}
