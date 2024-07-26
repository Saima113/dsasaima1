package Day8;
import java.util.*;

public class practice {
    public static void oddeven(){
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int sum1=0;
		int sum2=0;
		/*int[] arr= {N};
		for( int i=arr.length-1; i>0; i--){
			if(i%2!=0){
				sum1+=arr[i];
			}
			else{
				sum2+=arr[i];
			}

		}*/
		while(N>0){
		int ld= N%10;
		int[] arr={ld};
		if (arr[0]%2!=0){
			sum1+=ld;
		}
		else {
			sum2+=ld;
		}
		N=N/10;
		System.out.println(" "+arr[1]);
		
		
	}
	System.out.println(" odd sum : "+sum1);
	System.out.println(" even sum : "+sum2);
	
	


	}
    
		
	
    public static void main(String args[]) {
		oddeven();
		

    }

    
}
