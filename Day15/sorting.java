package Day15;

public class sorting {
    //merge sort
   public static void merge(int[]arr,int low,int mid,int high){
        int size=high-low+1;
        int[] temp=new int[size];
        int i=mid,j=high,k=size-1;
        while(i>=low && j>=mid+1){
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        // while(j>=mid+1){
        //     temp[k]=arr[j];
        //     k--;
        //     j--;
        // }
        while(i>=0){
            temp[k]=arr[i];
            i--;
            k--;
        }
        for(i=low;i<mid;i++){
            arr[i]=temp[i-low];
        }
        for( i=mid;i<mid;i++){
            arr[i]=temp[i-low];

        }
        // for(i=mid+1;i<=high;i++){
        //     arr[i]=temp[i-low];
        // }

    }
    static void mergeSort(int[] arr,int low,int high){
        if(arr.length==1)
        return;
        int mid=(high+low)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
        
    }

     public static void main (String[] args){
        int arr[]={1,3,5,2,3,6};
        int low=0;
        int high=arr.length-1;
        int mid=(low-high)/2;
        merge(arr,low,mid,high);
        mergeSort(arr,low,high);
        for(int i:arr) System.out.print(i+" ");

    }
    
}
