package Day21;

public class bank {
     public static void main (String[] args){
        bankacc customer =new bankacc();
        customer.name="amit";
        customer.accnumber=76123;
        customer.branch="rajouri garden";
        customer.balance=650000;
        // System.out.println(customer.balance);
        // customer.deposit();
        // System.out.println(customer.balance);
        customer.withdraw();

        System.out.println(customer.balance);
        System.out.println(customer.branch);
     }
    
}
