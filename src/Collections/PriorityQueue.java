package Collections;

import java.util.Iterator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> mydata = new java.util.PriorityQueue<>();

        mydata.add(32);
        mydata.add(30);
        mydata.add(12);
        mydata.add(72);
        mydata.add(39);
        mydata.add(32);
        mydata.add(1);

        Iterator iterator = mydata.iterator();

     //   System.out.println("peek :" + mydata.peek());
     //   System.out.println("poll :" + mydata.poll());

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
