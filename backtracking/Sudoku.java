import java.util.*;
class Sudoku
{
    public static boolean issafe(int[][] sudoku,int row , int col , int digit)
    {
        //column
        for(int i = 0 ; i < 9 ; i++)
        {
        if(sudoku[i][col] == digit)
        return false;
        }
        //row
        for(int i = 0 ; i < 9 ; i++)
        {
            if(sudoku[row][i] == digit)
            return false;
        }
        //grid
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i = startrow ; i < startrow+3 ; i++)
        {
            for(int j = startcol ; j < startcol+3 ; j++ )
            {
                if(sudoku[i][j] == digit)
                return false;
            }
        }
        return true;
    }
    public static boolean sudokusolver(int[][] sudoku , int row , int col)
    {
        //base case
        
        if(row == 9 && col ==0)
        {
            return true;
        }
        //recursion
        int newcol = col+1,newrow = row;
        if(col+1 == 9)
        {
            newrow = row+1;
            newcol = 0;
        }

         if(sudoku[row][col] != 0)
         {
            return sudokusolver(sudoku,newrow,newcol);
         }

        for(int digit = 1 ; digit <= 9 ; digit++)
        {
            if(issafe(sudoku,row,col,digit))
            {
                sudoku[row][col] = digit;
                if(sudokusolver(sudoku,newrow,newcol))
                {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printsudoku(int[][] sudoku)
    {
       // System.out.println();
        for(int i = 0 ; i< 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                System.out.print("| "+sudoku[i][j]);
            }
             System.out.println();
            System.out.print("----------------------------|");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        
        int sudoku[][] = {{7,0,3,0,0,4,0,0,6},
        {0,9,0,0,6,0,0,0,0},
        {0,0,4,0,0,2,9,0,0},
        {3,1,0,0,9,8,6,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,6,4,3,0,0,7,8},
        {0,0,1,8,0,0,2,0,0},
        {0,0,0,0,4,0,0,1,0},
        {5,0,0,7,0,0,8,0,3}};
        for(int i = 0 ; i< 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                System.out.print("| "+sudoku[i][j]);
            }
             System.out.println();
            System.out.print("----------------------------|");
            System.out.println();
        }

        if(sudokusolver(sudoku,0,0))
        {
            System.out.println("solution exists");
            printsudoku(sudoku);
        }
        else
        {
            System.out.println("solution does not exists");
        }       
    }
}