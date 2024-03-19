import java.util.*;
class arrayf
{   
    public static void print(int a[])
    {
        for (int i = 0 ; i<a.length ; i++)
        {
           System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO OF ELEMETS");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        print(a);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}