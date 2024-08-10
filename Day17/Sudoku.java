package Day17;
import java.util.*;

public class Sudoku {

    public static boolean check(int[][] sudoku,int i,int j,int n,int number){
        //checking horizontal and vertical
        for(int x=0;x<n;x++)
            if(sudoku[x][j]==number || sudoku[i][x]==number)
                return false;

                //check the whole block
                int rn=(int)Math.sqrt(n); //n is 9 rn is root number
                int sx=(i/rn)*rn; // sx simple
                int sy=(j/rn)*rn;

                for(int x=sx;x<sx+rn;x++)
                    for(int y=sy;y<sy+rn;y++)
                    if(sudoku[x][y]==number)
                    return false;
              return true;
    }

    public  static boolean sudokuSolver(int[][] sudoku,int i,int j,int n){
        if(i==n) //answer found
        return true;
        if(j==n)
        return sudokuSolver(sudoku, i+1, 0, n);
        if(sudoku[i][j]!=0) //block prefilled
        return sudokuSolver(sudoku, i, j+1, n);

        for(int number=1;number<=9;number++){
            if(check(sudoku, i, j, n, number)){
                sudoku[i][j]=number;
                if(sudokuSolver(sudoku,i,j+1,n)) return true;    
            }
        }
        sudoku[i][j]=0;
        return false;

    }
     public static void main (String[] args){
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] sudoku= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            sudoku[i][j]=sc.nextInt();
        System.out.println();
        System.out.println();
        sudokuSolver(sudoku,0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(sudoku[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}

    
