//find the common element in all the sorted rows in increasing order of the 2d array
//it can be done by taking 1st row as key and searching in other rows
//O(m*n*n);
//if we use binary search the it can be done by O(m*n*log(n))
//can also be done using hash maps


//by using hashmaps
//store each row in each hashmap
//search for elements of 1st row in all the rows and return the common ele
import java.util.*;
class commonele
{
    public static int fun(int[][] mat)
    {
        //create a col matrix which stores column index of each row with last ele
        int col[] = new int[mat.length];
        int minrow = 0;

        for(int i = 0 ; i < mat.length ; i++)
        {
            col[i] = mat[0].length-1;
        }
        
        while(col[minrow]>=0)
        {
        for(int i = 0 ; i < mat.length ; i++)
        {
            if(mat[minrow][col[minrow]] > mat[i][col[i]])
            {
                minrow = i;
            }
        }

        int eqcount=0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            if(mat[i][col[i]] > mat[minrow][col[minrow]])
            {
                if(col[i]==0)
                return -1;
                
                col[i]--;
            }
            else
            {
                eqcount++;
            }
        }

        if(eqcount == mat.length)
        {
            return mat[minrow][col[minrow]];
        }  
        }  
        return -1;
    }
    public static void main(String args[])
    {
        int mat[][] = {{1,2,3,4,5},{2,4,5,8,10},{3,5,7,9,11},{1,3,5,7,9}};
        int res = fun(mat);
        System.out.println(res);
    }
}
