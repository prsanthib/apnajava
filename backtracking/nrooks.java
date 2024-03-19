import java.util.*;
class nrooks
{
    public static boolean issafe(char[][] board , int row , int col)
    {
        //verticalup
        for(int i = row -1 ; i >= 0 ; i--)
        {
            if(board[i][col] == 'R')
            {
            return false;
            }
        }
         return true;
    }
    public static void nrook(char[][] board , int row)
    {
        if(row == board.length)
        {
            printboard(board);
            return;
        }
        //nrooks can be placed in n rows
        for(int j = 0 ; j < board.length ; j++)
        {
            if(issafe(board,row,j))
            {
            board[row][j] = 'R';
            nrook(board,row+1);
            board[row][j] = 'X';
            }
        }
    }
    public static void printboard(char[][] board)
    {
        System.out.println("_____________chessboard_________________");
        for(int i = 0 ; i< board.length ; i++)
        {
            for (int j = 0 ; j < board.length ; j++)
            {
                System.out.print(""+board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 4;
        //chessboard
        char board[][] = new char[n][n];
        for(int i = 0 ;i < n ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                board[i][j] = 'X';
            }
        }

        nrook(board,0);
        
    }
}