import java.util.*;
class noof7s
{
    public static void main(String args[])
    {
        int [][]a = {{1,2,3},{3,5,6},{0,4,5}};
        int count = 0;
        for(int i = 0 ;i<a.length ; i++)
        {
            for (int j = 0 ; j<a[0].length ; j++)
            {
                if(a[i][j] == 3)
                {
                    count++;
                }                
            }
        }
        System.out.println("3 is repeated "+count+" times");
    }
}