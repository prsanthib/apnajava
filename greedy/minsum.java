//min sum of absolute differences
//find the difference between 
import java.util.*;
class minsum
{
    public static void main(String args[])
    {
        int a[] = {4,5,6};
        int b[] = {9,7,8};

        Arrays.sort(a);
        Arrays.sort(b);

        int diff = 0;
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++)
        {
            diff = Math.abs(a[i] - b[i]);
            sum += diff;
        }

        System.out.println("sum of minimum difference is "+sum);
    }
}