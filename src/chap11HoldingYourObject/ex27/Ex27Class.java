package chap11HoldingYourObject.ex27;

import java.util.LinkedList;
import java.util.Queue;

class Command{
    String s;
    void operation(){
        System.out.println(s);
    }
    Command(String s){
        this.s = s;
    }
}

class ThirdClass{
    void printQueue(LinkedList<Command> cm){
        while(cm.peek() != null){
            cm.remove().operation();
        }
    }
}
public class Ex27Class {

    Queue<Command> fillQueue(LinkedList<Command> listQueue){
        listQueue.offer(new Command("Luan"));
        listQueue.offer(new Command("Pham"));
        listQueue.offer(new Command("Ngoc"));
        return listQueue;
    }

    ThirdClass tr = new ThirdClass();

    public static void main(String[] args) {
        LinkedList<Command> cm = new LinkedList<Command>();
        Ex27Class ex = new Ex27Class();
        ex.fillQueue(cm);
        ex.tr.printQueue(cm);

    }
}
