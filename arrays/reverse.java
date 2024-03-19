import java.util.*;
class reverse
{
    public static void rev(int a[],int n)
    {
        int start = 0,end = n-1;
        while(start < end)
        {
            int temp = a[start];
                a[start]= a[end];
                  a[end]=temp;
                  start++;
                  end--;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS OF ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("THE ARRAY IS");
        for (int i = 0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        rev(a,n);
         System.out.println("REVERSE OF THE ARRAY IS");
        for (int i = 0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }

    }
}