package chap07.ex06;

class Game {
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess(){
        // Compiler error if you are not define this
        // because there is no defaul construtor in BoardGame
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
