/*import java.util.*;
class nqueensallways
{
    public static boolean issafe(char[][] board , int row , int col)
    {
        //vertical left
        for(int i = row-1,j = col-1 ; i>=0 && j>=0 ; i--,j--)  
        {
            if(board[i][j] == 'Q')
            return false;
        }  
        //vertical right
        for(int i = row-1,j = col+1 ; i>=0 && j < board.length ; i--,j++)  
        {
            if(board[i][j] == 'Q')
            return false;
        }  
        //vertical up
        for(int i = row-1 ; i>=0 ; i--)  
        {
            if(board[i][col] == 'Q')
            return false;
        }  

        return true;
    } 
    public static void nqueens(char board[][] , int row) 
    {
        if(row == board.length)
        {
            printboard(board);
            return;
        }
        // n rows n queens
        for(int j = 0 ; j < board.length ; j++)
        {
            if(issafe(board,row,j) == true)
            {
            board[row][j] = 'Q';
            nqueens(board,row+1);
            board[row][j] = 'X';
            }

        }
    }
    public static void printboard(char[][] board)
    {
        System.out.println("_____________chessboard_________________");
        for(int i = 0 ; i < board.length ; i++)
        {
            for (int j = 0 ; j< board.length ; j++)
            {
                System.out.print(""+board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 4;
        char board[][] = new char[n][n] ; 
        //intilise
        for (int i = 0 ;i< n ; i++)
        {
            for (int j= 0 ;j< n ; j++)
            {
                board[i][j] = 'X';
            }
        }
        nqueens(board , 0);
    }
}*/
import java.util.*;
class nqueensallways
{
    static int count = 0 ;
    public static boolean nqueens(char[][] board , int row)
    {
        if (row == board.length)
        {
            count++;   //no of solutions
            //printboard(board);
            return true;
        }
        
        for (int j = 0 ; j < board.length ; j++)
        {
            if(issafe(board,row,j)){
            board[row][j] = 'Q';
            if(nqueens(board,row +1))
            {
                return true;
            }
            else{
            board[row][j] = 'X';
            }
            }
        }
        return false;
    }
    public static void printboard(char[][] board)
    {
        System.out.println("_____________chessboard_________________");
        for (int i = 0 ; i< board.length ; i++)
        {
            for (int j = 0 ; j< board.length ; j++)
            {
                System.out.print(""+board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean issafe(char[][] board,int row , int col)
    {
        //vertical up
        for(int i = row-1 ; i>=0 ; i--)
        {
            if(board[i][col] == 'Q')
            return false;
        }
        //vertical left
        for(int i = row-1,j = col-1 ; i>=0 && j>=0 ; i--,j--)
        {
            if(board[i][j] == 'Q')
            return false;
        }
        //vertical right
        for(int i = row-1,j = col+1 ; i>=0 && j<board.length ; i--,j++)
        {
            if(board[i][j] == 'Q')
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n =4;
        char board[][] = new char[n][n];
        //initilize
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                board[i][j] = 'X';
            }
        }

       if(nqueens(board , 0))
       {
        printboard(board);
       }
        System.out.println("no of solutions is "+count);
     }
}