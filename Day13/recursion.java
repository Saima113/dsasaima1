package Day13;

public class recursion {
    public static void print(int n){
        //base case
        if(n==10){
            System.out.println(n);
            return;
        }// else
        System.out.println(n);
        print(n+1);
    }


    static int sum(int n, int a){
        if(n==1){
            return a+n;
        }
        return sum(n-1 , a+n);
    }


    //head recursion
    static int sumHead(int n){
        if(n==1) return 1;
        return n+sumHead(n-1);
    }

    static int countEven(int n,int count){
        if(n==1){
            return count;
        }
        if(n%2==0) {
            count++;
        }
         return countEven(n-1,count);
    }


    //head recursion
    static int countEvenHead(int n){
        if(n==1){
            return 0; //base case
        }
        if(n%2==0){
            return 1+ countEvenHead(n-1);  //i am even so check previous ones and add me to the count of previous even ones
        }
        else
            return countEvenHead(n-1);    
    }
    // power function using head recursion
    static int power(int base,int pow){
        if (pow==0) 
        return 1;
        return base *power(base,pow-1);
    }
    //tail recursion
    static int powertail(int base,int pow,int ans){
        if(pow==0)
        return ans;
        return powertail(base,pow-1,ans*base);

    }
    //head
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);    
    }
    //tail
    static int factorialtail(int n,int fact){
        if(n==1 || n==0){
            return fact;
        }
        return factorialtail(n-1,fact*n);
    }
    //head finding nth term of series
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    //tail fibonacci
    static int fibonaccitail(int n,int ans){
        if(n==0 || n==1){
            return ans;
        }
        return ans=fibonaccitail(n-1,ans)+fibonaccitail(n-2,ans);
    }

     public static void main (String[] args){
        int n=10;
        //print(n);

        //int sum=sum(n,0);
        //for(int i=n;i>=1;i--)
           // sum+=i;
            //System.out.println(sum);
            
            System.out.println(countEven(n,0));
           
            System.out.println(fibonaccitail(9,1)); 

    }

 }
    

