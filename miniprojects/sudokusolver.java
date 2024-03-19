import java.util.*;
class sudokusolver
{
    
    public static boolean issafe(int key , int row ,int col , int sudoku[][])
    {
        //col
        for(int i = 0 ; i < 9 ; i++)
        {
            if(sudoku[i][col] == key)
            return false;
        }

        //row
        for(int i = 0 ; i < 9 ; i++)
        {
            if(sudoku[row][i] == key)
            return false;
        }

        //grid
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;

        for(int i = startrow ; i < startrow+3 ; i++)
        {
            for(int j = startcol ; j < startcol+3 ; j++)
            {
                if(sudoku[i][j] == key)
                return false;
            }
        }

        return true;
    }
    public static boolean sudokusolver(int sudoku[][] , int row , int col)
    {
        //base case
        if(row == 9 && col == 0)
        {
            return true;
        }

        int newrow = row;
        int newcol = col + 1;

        if(col + 1 == 9)
        {
            newrow = row + 1;
            newcol = 0;
        }

        if(sudoku[row][col] != 0)
        {
            return sudokusolver(sudoku,newrow , newcol);
        }
        for(int i = 1 ; i <= 9 ; i++)
        {
            if(issafe(i , row , col, sudoku))
            {
                sudoku[row][col] = i;

                if(sudokusolver(sudoku,newrow,newcol))
                {
                    return true;
                }

                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][])
    {
        for(int i = 0 ; i < sudoku.length ; i++)
        {
            for(int j = 0 ; j < sudoku[0].length ; j++)
            {
                System.out.print("|"+sudoku[i][j]+" ");
            }
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

        if(sudokusolver(sudoku , 0 , 0))
        {
            System.out.println("Solution exists");
            print(sudoku);
        } else {
            System.out.println("solution does not exists");
        }
    }
}