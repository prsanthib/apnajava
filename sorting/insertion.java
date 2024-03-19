import java.util.Scanner;
class insertion
{
    public static void insert(int a[],int n)
    {
        for (int i = 1 ; i<n ; i++)
        {
            int curr = a[i];
            int prev = i-1;
            while(prev >=0 && curr < a[prev])
            {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
    }
    public static void printl(int a[] , int n)
    {
        for (int i = 0 ; i<n ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS IN ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for (int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        insert(a,n);
        printl(a,n);
    }
}