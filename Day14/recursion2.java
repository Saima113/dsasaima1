package Day14;

public class recursion2 {
    public static void cointoss(int N, String ans){
        if(N==0){
            System.out.println(ans);
            return;
        }
        cointoss(N-1,ans+"H");
        cointoss(N-1,ans+"T");    
     }

    // generating subsequence
     public static void subsequence(String ques, String ans){
        if(ques.isEmpty()){
            System.out.println(ans);
            return ;
        }
        subsequence(ques.substring(1), ans+ques.charAt(0));
        subsequence(ques.substring(1), ans);
    }

    //head recursion to count the number of substrings
    public static int subseqcount(String ques){
        if(ques.isEmpty()){
        return 1;
        }
        int num1=subseqcount(ques.substring(1)); // when included
        //int num2=subseqcount(ques.substring(1)); // when not included
        return num1*2; //no of subsequences is power of 2
    }

    //valid paranthesis
    //r>=l
    //n>l
    public static void validparenthesis(int n,int l,int r,String ans){
        if(l==n && l==r){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l){ //corner case
            return;
        }
        validparenthesis(n, l+1, r, ans+"{");
        validparenthesis(n, l, r+1, ans+"}");
     }

     public static void main (String[] args){
        int N=3;
        int l=0;
        int r=0;
        String ans=" ";
        String s="cat";
        cointoss(N,ans);
        subsequence(s,ans);
        //System.out.println(subseqcount(s));
        validparenthesis(N, l, r, ans);
        
     }
    
}

