package Day17;

public class SolveNqueen {
    
     public static boolean check(int[][] board,int i,int j,int n){
        //to check if queen can be placed in this box or not horizontal and vertical
        for(int x=0;x<n;x++){
            if(board[x][j]==1 || board[i][x]==1){
                return false;
            }
        }

        //checking diagonal  only checking diagonals on upper side
        int x=i,y=j;
        //left diagonal
        while(x>=0 && y>=0){
            if(board[x][y]==1) return false;
            x--;
            y--;
        }
        //right diagonal
        while(i>=0 && j<n){
            if(board[i][j]==1) return false;
            i--;
            y--;
        }
        //box is safe queen can be placed
        return true;
     }

     public static boolean NQueen(int[][]board,int i,int n){
        //base case
        if(i==n){
            //display matrix
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    System.out.print(board[x][y]+"  ");
                }
                System.out.println();
            }
            System.out.println();
            return false;
        }

        for(int j=0;j<n;j++) //column
            if(check(board, i, j, n)){  
                board[i][j]=1; //queen is placed if above check gives true
                if(NQueen(board, i+1, n)) return true; //check by moving forward if youre getting answer or not if not then change current placed queen
                board[i][j]=0; //backtrack if above if condition gives false
            }
            return false;
        

     }
     public static void main (String[] args){
        int n=4;
        int[][] board= new int[n][n];
        NQueen(board, 0, n);

     }
    
}
