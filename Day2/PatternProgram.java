

public class PatternProgram{
    public static void main(String[] args){
        int n=5;
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for(int j1=1; j1<=i; j1++){
                System.out.print("* ");
            }
            for(int j2=2; j2<=i; j2++){
               System.out.print("* ") ;
            }
            System.out.println();
        }
        
        
       
        }
    }

