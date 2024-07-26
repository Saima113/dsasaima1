package Day8;


import java.util.*;
public class hi {
	public static void oddeven(){
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int indexx = 1;
		int sum1=0;
		int sum2=0;
		
		while(N>0){
		
		int ld= N%10;
		if (indexx%2!=0){
			sum1+=ld;
		}
		else {
			sum2+=ld;
		}
		N=N/10;
		indexx++;
	}
	System.out.println("sum of odd : "+sum1);
		System.out.println("sum of even : "+sum2);

}
    public static void main(String args[]) {
		oddeven();
		

    }
}