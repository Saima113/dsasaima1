package Day3;
import java.util.*;

//100+2*4 100 is total array 2 is index to find out and 4 is size
public class Arrays {

    public static void displayArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" " );
        }

    }
    public static int reverseNum(int n){
        int revnum =0;
        while(n>0){
            int lastdigit=n%10;
            revnum= revnum*10 + lastdigit;
            n=n/10;
        }
           return revnum;
        
    }
    // to count the occurrences of a specific digit in a given integer
    public static int findLength(){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int digit= sc.nextInt();
        int count=0;
        while(n>0){
            int ld=n%10;
           if(ld==digit)
            count++;
            n=n/10;
        }
        return count;

    }
    public static int countDigits(int num) { //counting no of digits in the whole number
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    public static boolean Armstrong(){
        Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
        int c= countDigits(n);
        int temp =n;
        int sum=0;
        for(int i=1; i<=c; i++){
            sum+= Math.pow(temp%10, c);
            temp=temp/10;
        }
        if(n==sum){
            return true;
        }
        return false;

    }
    public static boolean primeNumber(){
        Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
        for(int i=2; i<N; i++){
            if(N%i==0)
                return false;
            }   
            
        return true;
    }
    public static void main(String[] args){                                                                                                     
        int arr[]= new int[10];
        arr[1]=10;
        arr[6]=25;
        arr[9]=76;
        // System.out.println(findLength());
        // System.out.println(Armstrong());
       
      System.out.println(primeNumber());
       
       
       
        
    }
    
    
}
