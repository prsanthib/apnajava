import java.util.Scanner;
class selection
{
    public static void selection(int a[], int n)
    {
        for (int i = 0 ; i < n ; i++)
        { 
            int min = i;
            for (int j = i+1 ; j < n ; j++)
            {
                if (a[j]<a[min])
                {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
                
        }
    }
    public static void print(int a[])
    {
        for (int i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main (String args[])
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
        selection(a,n);
        print(a);
    }
}