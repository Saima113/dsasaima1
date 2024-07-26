package Day7;

public class arrayngl {
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }




    public static void NGRNI(int[] nums, int[] arr){
       int max=0;
       for(int i=nums.length-1;i>=0;i--){
        arr[i]=max;
        max=Math.max(max,nums[i]);
        
       }    
    }

    public static void NGRI(int[] nums, int[] arr){
        int max=0;
        for(int i=nums.length-1;i>=0;i--){
            max=Math.max(max,nums[i]);
            arr[i]=max;
        }
    }
    public static void NGLNI(int[] nums, int[] arr){
        int max=0;
        for(int i=0; i<nums.length; i++){
            arr[i]=max;
        
            max=Math.min(max,nums[i]);
            
        }
    }
    public static void NGLI(int[] nums, int[]arr){
                                            
    }


    public static void main(String[] args){
        int[] nums= {2,3,1,8,7,3,4};
        int[] arr= new int[nums.length];
        display(arr);
        NGRNI(nums, arr);
        NGRI(nums, arr);

    }
    
}
