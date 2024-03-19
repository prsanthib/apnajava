//most optimised way to fix max sum of sub arrays
import java.util.Scanner;
class kadanes
{
    public static void kadan(int a[])
    {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0 ; i< a.length ; i++)
        {
            cs = cs +a[i];
          /*  if (cs < 0 )
            {
                cs = 0;
            }*/
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER  NO OF ELEMENTS IN ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        kadan(a);
    }
}