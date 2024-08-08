package Day16;

public class ratinmaze {
    static int[][] sol= new int[100][100];

    static void display(int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sol[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean RIAM(char[][] maze,int i,int j,int n, int m){
        //base case
        if(i==n-1 && j==m-1){
            sol[i][j]=1;
            display(n,m);
            return true;
        }
        //iff curr box is valid then move otherwise return and give false
        if( i>=0 && i<n && j>=0 && j<m && maze[i][j]!='X'&& sol[i][j]==0){
            sol[i][j]=1;
            //moving right
            RIAM(maze,i,j+1,n,m);
            //down
            RIAM(maze,i+1,j,n,m);
            //left
            RIAM(maze,i,j-1,n,m);
            //up
            RIAM(maze,i-1,j,n,m);
            
            //for backtracking
            sol[i][j]=0;
        }
        return false;
    }
     public static void main (String[] args){

        char[][] maze={
            {'0', 'X', '0', '0', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', 'X', '0', 'X', '0'},
            {'0', '0', '0', 'X', '0'}
        };
        RIAM(maze, 0, 0, 5, 5); // to change position of rat,change i and j
        //display(5,5);

     }
    
}
