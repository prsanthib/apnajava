import java.util.*;
class minandmaxofarray
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,5,6,111,23};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i]<min)
            min = a[i];
            if(a[i]>max)
            max = a[i];
        } 
        System.out.println("minimum element is "+min);
        System.out.println("maximum element is "+max);
    }
}