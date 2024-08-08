package Day15;

public class backtracking {
    static int sum=0;
    //backtracking
    // function returns a boolean value

    public static boolean backsumarray(int[] arr,int i,int k){
      if(i==arr.length) return true;
      if(sum>k) return false;
      //including current value in ans
      sum+=arr[i]; //assuming
      //checking if this can be included in final ans or not
      if(!backsumarray(arr,i+1,k)) // checking if previous i is stored in sum or not and whether satifies condiotion 10 or not
      {
        sum-=arr[i];
      }
      return true;

    }
    public static void sumArray(int[] arr,int i,int k){
        if(i==arr.length) return;
        sum+=arr[i];
        if(sum>k){
            sum-=arr[i]; // reverting the change made before to satisfy the condition
            return;
        }
        sumArray(arr,i+1,k);
    }
    
     public static void main (String[] args){
        int[] arr={1,2,3,4,15,7};
        sumArray(arr,0,10);
        System.out.println(sum);
        // System.out.println(backsumarray(arr, 0, 15));
       
     }
    
}
