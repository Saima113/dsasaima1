
import java.util.*;

public class Patternhw {
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //ques1
       /*for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            System.out.print(" * ");

        }
        System.out.println();
       }*/

        //ques2
        /*for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");

            }
            System.out.println();

        }*/

        //ques3
       /*  for(int i =n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");

            }
            System.out.println();

        }*/
        //ques4
        /*for(int i=1; i<=n; i++){
            for(int k=1; k<=(n-i); k++)
                System.out.print("   ");
                for(int j=1; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
                
            
            
        }*/
        //ques5
        /*for(int i=n; i>=1; i--){
            for(int k=n-i; k>=1; k--){

            

            
            System.out.print("  ");
            }
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();


        }*///ques6
        /*for(int i=n; i>=1; i--){
            for(int k=n-i; k>=1; k--){

            

            
            System.out.print("    ");
            }
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();


        }*/

        //ques7
        /*for(int i=1; i<=n; i++){
           

            
            for(int j=1; j<=n; j++){
                if(  i==1 || i==n || j==1 || j==n){
                System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        }
        
            System.out.println();
        }*/

        //ques8
        /*for(int i=1; i<=n ; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i+j==n+1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //ques9
        /*for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j1=1; j1<=i; j1++){
                System.out.print("*");
            }
            
        
        
            for(int j2=2; j2<=i; j2++){
                System.out.print("*");

            }
            System.out.println();

        }*/
        //ques10
        /*for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j1=1; j1<=i; j1++){
                System.out.print("*");
            }
            
        
        
            for(int j2=2; j2<=i; j2++){
                System.out.print("*");

            }
            System.out.println();

        }*/
        //ques11,12
        /*for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            

                
            
            
            for(int j=1; j<=i; j++){
                if((i+j)%2==0  ){
                    System.out.print(" * ");
                }
                
                    
                  else{
                    
                System.out.print(" ! ");}
            }
            for(int j2=2; j2<=i; j2++){
                if((i+j2)%2==0  ){
                    System.out.print(" * ");
                }
                
                    
                  else{
                    
                System.out.print(" ! ");}
                
                
            
            

            
            
            
        }
        System.out.println();



        

    }*/
    //ques13,14
    /*for(int i=1; i<=n; i++){
        for(int k=1; k<=n-i; k++){
            System.out.print("  ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i1=n-1; i1>=1; i1--){
        for(int k1=(n-i1); k1>=1; k1--){
            System.out.print("  ");
        }
        for(int j1=1; j1<=i1; j1++){
            System.out.print("* ");
        }
        System.out.println();
    }*/
    //ques15
    /*for(int i=n; i>=1; i--){
        for(int k=n-i; k>=1; k--){

        

        
        System.out.print("    ");
        }
        for(int j=1; j<=i ;j++){
            System.out.print("* ");
        }
        System.out.println();


    }
    for(int i=2; i<=n; i++){
        for(int k=1; k<=n-i; k++){

        

        
        System.out.print("    ");
        }
        for(int j=1; j<=i ;j++){
            System.out.print("* ");
        }
        System.out.println();


    }*/

   sc.close(); 
}
}
    

