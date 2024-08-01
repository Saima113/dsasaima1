package Day10;

public class hello {
   public static int findRow(int[][]arr, int target){
        int col=arr[0].length-1;// 7,20,60
        int ans=-1;
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid][col]<target){
            /*low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }*/
        }
        System.out.println(arr[0][col]);
        System.out.println(high);
        System.out.println(col);
        System.out.println(mid);
        System.out.println(arr[mid][col]);
        
      return ans;
    }
}
    public static void main(String[] args){
        int[][] arr={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}


        };
        findRow(arr,3);
    }
    
}
