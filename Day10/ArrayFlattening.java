package Day10;
import java.util.*;

public class ArrayFlattening {
    public static int[] arrayFlattening(int [][] arr){
        int rows=arr.length;int cols=arr[0].length;
        int[] nums= new int[rows*cols];
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                int ans= arr[0].length*i+j;
                nums[ans]=arr[i][j];    
            }
        }
        return nums;


    }

    static void fillArray(int[][]arr, int[] nums){
        for(int i=0; i<nums.length; i++){
            arr[i/arr[0].length][i%arr[0].length]=nums[i];
        }
    }

    public static void display(int[] nums){
        for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+" ");      
        }
        System.out.println();
    }

    public static void display2d(int[][] arr){
        for(int i=0;i<arr.length;i++){
          display(arr[i]);
        }
    }

    public static void main(String[] args){
        int[][] arr= {
            {2,3,2,4},
            {5,6,5,8},
            {9,5,7,7}
        };
        int[] nums=arrayFlattening(arr);
        Arrays.sort(nums);
        fillArray(arr,nums);
        //display(nums);
        display2d(arr);

    }
    
}
