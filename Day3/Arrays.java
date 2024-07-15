package Day3;

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
    public static int findLength(int n){
        
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;

    }
    public static boolean Armstrong(int n){
        int c= findLength(3);
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
    public static boolean primeNumber(int a ){
        for(int i=2; i<a; i++){
            if(a%i==0)
                return false;}
            
            
        return true;

        
        
        
        


    }
    public static void main(String[] args){                                                                                                     
        int arr[]= new int[10];
        arr[1]=10;
        arr[6]=25;
        arr[9]=76;
       System.out.println( Armstrong( 3));
       
       
        
    }
    
    
}
