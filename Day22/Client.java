package Day22;

public class Client {
     public static void main (String[] args){
       LinkedList ll=new LinkedList();
       ll.addFirst(10);
       ll.addFirst(20);
       ll.addFirst(30);
       ll.addLast(50);
       ll.addAtIndex(100, 2);
    //    System.out.println(ll.getStart());
    //    System.out.println(ll.getEnd());
    //    System.out.println(ll.getIndex(3));
    //    System.out.println(ll.size());
       System.out.println(ll.removeIndex(2));
       ll.display();
       
      
     }
    
}
