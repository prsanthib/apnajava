import java.util.*;
class largest
{
    public static void main(String args[])
    {
        String []a ={"prasanthi","tarun","minnarao","meenakumari"};
        String largest = a[0];
        String smallest = a[0];
        for(int i = 1 ; i < a.length ; i++)
        {
            if(largest.compareTo(a[i]) < 0)
            {
                largest = a[i];
            }
            if(smallest.compareTo(a[i]) > 0)
            {
                smallest = a[i];
            }
        }
        System.out.println(" "+largest);
        System.out.println(" "+smallest);
    }
}