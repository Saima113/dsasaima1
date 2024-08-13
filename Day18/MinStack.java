package Day18;
import java.util.Stack;

public class MinStack{
     Stack<Integer> stk;
     Stack<Integer> Minstk;
     public  MinStack(){ //constructor
          stk=new Stack<>();
          Minstk=new Stack<>();
     }
     public  void push(int val){
          stk.push(val);
          if(Minstk.empty() || val<=Minstk.peek()){
               Minstk.push(val);
          }
     }
     public void pop(){
          if(stk.peek().equals (Minstk.peek())){
               Minstk.pop();

          }
          stk.pop();
     }
     public int top(){
         return stk.peek();
     }

     public int getMin(){
          return Minstk.peek();
     }

      public static void main (String[] args){
          int val=10;
         
      }
    
}
