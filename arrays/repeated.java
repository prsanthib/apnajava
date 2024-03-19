// this is brut force O(n^2)
import java.util.Scanner;
class repeated
{
    public static boolean repeatedelements(int a[] , int n)
    {   
        int found = 0;
        for (int i = 0 ; i<n ; i++)
        {
            for (int j = i+1  ; j<n  ; j++)
            {
               if( a[i] == a[j])
               {
                return true;
               }
            }
        }
        return false;
    }
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY ");
        for (int i = 0 ; i< n ; i++)
        {
            a[i] = sc.nextInt();
        }
        boolean k = repeatedelements(a,n);
        System.out.println(k);
    }
}    