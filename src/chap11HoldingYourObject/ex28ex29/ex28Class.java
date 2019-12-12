package chap11HoldingYourObject.ex28ex29;

import java.util.PriorityQueue;
import java.util.Random;
class NoMember{

}

public class ex28Class {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueueDouble = new PriorityQueue<Double>();
        Random rd = new Random(100);
        for(int i = 0; i < 10; i++){
            priorityQueueDouble.offer(rd.nextDouble());
        }

        // Display Priority Poll
        while(priorityQueueDouble.peek() != null){
            System.out.println(priorityQueueDouble.poll());
        }

        //Ex29: Can not add multi elements of No member class into PriorityQueue
        PriorityQueue<Object> t = new PriorityQueue();
        t.offer(new NoMember());
        t.offer(new NoMember());
        t.offer(new NoMember());
    }
}
