package Day21;
import java.util.*;

public class bankacc {
    String name;
    int accnumber;
    int balance;
    String occupation;
    String branch;
    int pinnumber;

     bankacc(String name, int accnumber,int balance, String occupation,String branch,int pinnumber ){
        this.name=name;
        this.accnumber=accnumber;
        this.balance=balance;
        this.pinnumber=pinnumber;
     }
     


    public int getBalance() {
        return balance;
    }



    public int getPinnumber() {
        return pinnumber;
    }



    public void setPinnumber(int pinnumber) {
        this.pinnumber = pinnumber;
    }



    public void setBalance(int amount, int pinnumber) {
       if( this.pinnumber == pinnumber && (balance-amount)>=0){
        balance-=amount;
       }
       else{
        System.out.println("low balance");
       }
      
    }



    void withdraw(){
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        balance-=amt;
        sc.close();
    }
    
    void deposit(){
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        balance+=amt;
        sc.close();
    }

   
    
}

