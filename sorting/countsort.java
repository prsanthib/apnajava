import java.util.Scanner;
class countsort{
public static void countsort(int a[] , int n)
{
    int largest = Integer.MIN_VALUE;
    for (int i = 0 ; i < n ; i++)
    {
        largest = Math.max(largest,a[i]);
    }
        int count[] = new int[largest+1];
    for (int i = 0 ; i< n ; i++)
    {
        count[a[i]]++;
    }
    //sorting
    int j = 0;
    for (int i = 0 ; i< count.length; i++)
    {
        while (count[i] > 0)
        {
            a[j] = i;
            j++;
            count[i]--;
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
        countsort (a,n);
        print(a);
    }
    }