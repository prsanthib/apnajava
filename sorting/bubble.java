import java.util.Scanner;
class bubble
{
    public static void bubble(int a[], int n)
    {
        for (int i = 0 ; i < n  ; i++)
        { 
            for (int j = 0 ; j < n-1-i ; j++)
            {
                if (a[j] < a[j+1])    // for descending order
                {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
        }
    }
    public static void print(int a[])
    {
        for (int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS OF ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0 ; i< n; i++)
        {
            a[i] = sc.nextInt();
        }
        bubble (a,n);
        print(a);
    }
}