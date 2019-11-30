package chap07ReusingClass.ex24;

public class Ex24Class extends Beetle {

    private int k = printInit("Beetle.k initialized");
    public Ex24Class() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
