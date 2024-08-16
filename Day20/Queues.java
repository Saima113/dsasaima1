package Day20;
import java.util.*;

public class Queues {
   
//  adding value -> q.add();
//  remove value     q.remove() 
//  front element    q.peek()
//  throws exception    q.element()
     public static void main (String[] args){
        Queue<Integer> q= new LinkedList<>();
        System.out.println(q.peek()); //gives null when queue empty
        System.out.println(q.poll()); //gives null when queue empty
        // System.out.println(q.element());
        q.add(4);
        q.add(8);
        q.add(6);
        q.add(2);
        System.out.println(q);
        q.remove(4);
        q.remove(9);
        // System.out.println(q);
        // System.out.println(q.remove(10));
        // System.out.println(q.peek());
        // System.out.println(q.element());
        // System.out.println(q.offer(0));  // added it in the end
        // System.out.println(q);
        System.out.println(q.poll()); //removes the element at front and returns it

     }
    
}
