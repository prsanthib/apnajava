import java.util.Arrays;
import java.util.Collections;
class inbuiltsort
{
    public static void main(String args[])
    {
        int a[] = {3,5,1,7,4,8,9,2};
        Arrays.sort(a);
        for (int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int b[] = {3,5,1,7,4,8,9,2};
        Arrays.sort(b,3,7);
        for (int i = 0  ;i<b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
       Integer c[] = {3,5,1,7,4,8,9,2};
        // Arrays.sort(a,3,7,Collections.reverseOrder());
        // Collections work on objects so nt is converted to Integer
        Arrays.sort(c,Collections.reverseOrder());
        for (Integer i = 0 ;i<c.length; i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}