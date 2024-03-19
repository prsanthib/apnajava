import java.util.*;
class sumof2ndrow
{
    public static void main(String args[])
    {   
        int sum = 0;
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0;i < a[0].length ; i++)
        {
         sum += a[1][i]; 
        }
        System.out.println(sum+" ");
    }
}