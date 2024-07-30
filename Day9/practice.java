package Day9;

import java.util.*;
public class practice {
	public static void sumList(){
		Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
		int sum=0;
		for(int i=0; i<arr.length;i++){
			sum+=arr[i];
			if(sum<0){
				break;
			}
			System.out.println(arr[i]);
		}

	}
    public static void main(String args[]) {
		sumList();
		

    }
}
    

