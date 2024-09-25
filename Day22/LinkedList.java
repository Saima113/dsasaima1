package Day22; //week6

public class LinkedList {
    class Node{
        int data;
        Node next;
    }
    //big O(1)

    private Node head;
    private Node tail;
    private int  size;

    //create a node if emptly list and store item in it
    public void addFirst(int item){
        Node nn=new Node();
        nn.data= item; //to add data given by user ie item
        if(size==0){ //if list is empty
            head=nn; //pehla element hi head aur tail hoga abhi
            tail=nn;
        }
        else{
            //if list is not empty then add node to the left
            nn.next=head;
            head=nn;  
        }
        size++;

    }
    //add element to the end of the list
    public void addLast(int item){ //big O(1)
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }

    }
    //to get node by entering an index
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++)
            temp=temp.next;
           return temp; 

    }

    public void addAtIndex(int item, int index){
        if(index==0)
        addFirst(item);
        else if(index==size)
        addLast(item);
        else{
            Node nn=new Node();
            nn.data=item;
            Node k_1th= getNode(index-1);
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }

    //get function to retrieve data from start,end,index
    public int getStart(){
        return head.data;
    }

    public int getEnd(){
        return tail.data;
    }

    public int getIndex(int index){
        if(index==0)
        return getStart();
        else if(index==size-1)
        return getEnd();
        else{
        return getNode(index).data;
        }
    }
    //function to remove data from start,end,index

    public int removeFirst(){ //start
        int rn=head.data;
        if(size==1){
            head=null;
            tail=null;
        }else{
            Node temp=head;
            head=head.next;
            temp.next=null; 
        }
        size--;
        return rn;
    }

    public int removeEnd(){ //tail
        if(size==1){
          return  removeFirst();
        }else{
            int rn=tail.data;
            Node sl=getNode(size-2);
            sl.next=null;
            tail=sl;
            size--;
            return rn;    
        }
    }

    public int removeIndex(int index){//index
        if(index==0)
        return removeFirst();
        else if(index==size-1)
        return removeEnd();
        else{
            Node k_1th=getNode(index-1);
            Node temp=k_1th.next;
            int rn =temp.data;
            k_1th.next=temp.next;
            temp.next=null;
            size--;
            return temp.data;

        }
    }


    //display
    public void display(){ //big O(n)
        //~ interesting ~
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
              
        }
        System.out.println("null");
    }

    public int size(){
        return size;
    }
    
    

    
}
