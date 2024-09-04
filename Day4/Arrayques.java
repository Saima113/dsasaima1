package Day4;
import java.util.*;


public class Arrayques{
    public static int arrsum( ){
        int arr[] = {12, 13, 14, 15, 16};
        int sum=0;
        for(int i=0 ; i<arr.length; i++){
            sum+=arr[i];

        }
      return sum;
    }
    public static int searcharr(int arr[]){
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        for(int i =0; i<arr.length; i++){
            if(n==arr[i]){
                return i;
            }
        }
        return -1;
        
      
    }
    public static void swap(int a , int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.print("a :"+a);
        System.out.print("b :"+b);
    }

    public static void change(int[] adi, int i, int j){
        int temp = adi[i];
        adi[i]= adi[j];
        adi[j]= temp;    
    }

    public static void revarray(int[] arr){
        int i=0; int j=arr.length-1;
        while(i<j){
            change(arr, i++, j--);
        }    
    }

     public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
     }

     public static void revarray1(int[] arr, int i, int j){
        while(i<j){
            change(arr, i++, j--);
        }     
    }

    public static int maxarr(int[] arr){
        int max= arr[0];
     for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    public static int maxarrindex(int[] arr){
        int max= 0;
        int ans=0;
         for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
                ans=i;
            }
        }
        return ans;
    }

    static int[] selectionSort(int[] arr){
        int[] ans= new int [arr.length];
        for(int i=0;i<arr.length-1;i++){
           int idx= minarr(arr, i);

            int temp=arr[i];
            arr[i]= arr[idx];
            arr[idx]=temp; 
            ans[i]= arr[i];  
        }
        return  ans;
        
    }
    //find index of minimum element
    public static int minarr(int[] arr, int a ){
        int min= a;
        for(int i=a+1; i<arr.length; i++){
            if(arr[i]<arr[min]){
                min= i;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int arr[]={17,4,3,12,81,22,1}; 
        System.out.println(minarr(arr, 0));
        System.out.println(selectionSort(arr));
        

    }
    }



