package Day9;
import java.util.*;

public class twodarray {

    public static int[] searcharray(int[][] arr, int n){
        int[] arr1= {-1,-1};
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==n){
                    arr1[0]=i;
                    arr1[1]=j;
                    return arr1;
                }
                
            }
        }
        return arr1;
    }
    public static void insert(int[][] arr){
        int nums=1;
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++)
            arr[i][j]=nums++;;
        }

    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr){
        int[][] nums= new int[arr[0].length][arr.length];
        //nums.len=arr[0].len
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                nums[j][i]=arr[i][j];
                
            }
        }
        return nums;
    }
    //comparable function
    static void sortbyCol(int arr[][], int col){
        Arrays.sort(arr, (a,b)-> Integer.compare(a[col] , b[col]));
    }
    static void sortbyRow(int arr[][]){
        for(int i=0; i<arr.length; i++){
            Arrays.sort(arr[i]);
        }
    }


    public static void main(String[] args){
        int[][] arr= {
            {2,3,4,5},
            {6,9,8,1},
            {4,4,5,8}

        };
        //Arrays.sort(arr);
        // sortbyCol(arr, 1);
        
        sortbyRow(arr);
        display(arr);

        // 2d and 3d arrays can be made in  java
        /*int [][] arr=new int [5][5];
       insert( arr);
       display(arr);
       System.out.println();
       System.out.println();
       int[][] nums= transpose( arr);
       display(nums);*/

    }
    
}
