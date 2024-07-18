package Day5;
import java.util.Arrays;
public class Sorting {

    /*public static int binarySearch(int[]arr, int key){
        int start=0;  int end=arr.length-1; 
        while(start<=end){
            int mid= (start+end)/2;
         if(arr[mid]==key)
            return mid;
            if (arr[mid]>key)
                end = mid-1;
                else
                start=mid+1;
        }

            
        

        


      return -1;
    }*/

    public static int lowerBound(int[] arr, int key){
        int start=0;  int end=arr.length-1; int ans=-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;  
            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
     return ans;
    }
    //upper bound-> last occurence+1
    public static int upperBound(int[] arr, int key){
        int start=0;  int end=arr.length-1; int ans=-1;
        int upper=0;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==key){
                ans=mid; //ans=mid+1
                end=mid-1; //start=mid+1
                upper=ans+1 ; 
            }
             if (arr[mid]>key){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
            
        }
     return upper;
    }


    public static void main(String[] args){
        int [] arr= { 1,2,2,4,4,4,5,6,7,8,9};
        Arrays.sort(arr);
       System.out.print( upperBound( arr,3 ));
        

    }
    /*public static void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1; i<n;i++){
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];

                --j;
            }
            arr[j+1]= key;

        }

    }  */
      
    
}
