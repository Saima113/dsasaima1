package Day21;
import java.util.*;

public class bankacc {
    String name;
    int accnumber;
    int balance;
    String occupation;
    String branch;


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

