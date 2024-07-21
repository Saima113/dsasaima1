package Day5;

public class Sortingpractice {

    public static int plusOne(int[] digits) {
       int n=digits.length;
       int ans=digits[n/2];
       return ans;
    }

    public static void main(String[] args){
        int [] digits={1,2,3,4,5,6,7};
        System.out.println(plusOne(digits));
        
    }
    
}
