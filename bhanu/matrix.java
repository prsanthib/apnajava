import java.util.*;
class matrix
{
    public static void inverse(int mat[][])
    {
        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = 0 ; j< mat[0].length ; j++)
            {
                int temp[i][j] = mat[j][i]; 
            }
        }
    }

    public static void print(int mat[][])
    {
        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = 0 ; j < mat[0].length ; j++)
            {
                System.out.print(mat[i][j]);  
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int mat[][] = {
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0},
        {1,2,3,4,5,6,7,8,9,0}};

        inverse(mat);
        print(mat);
    }
}