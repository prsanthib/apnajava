import java.util.Scanner;
class subarray
{
    public static void subarray(int a[])
    {int ts =0 ;
        for (int i = 0 ;i<a.length;i++)
        {
            int start = i;
            for (int j = i ; j<a.length;j++)
            {
                int end = j;
                for (int k =start;k<=end ; k++ )
                {
                    System.out.print(a[k]+" ");
                }
                ts++;
                System.out.println();
            }System.out.println();
        }System.out.println("total no of sub arrays is "+ts);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS IN THE ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        subarray(a);
    }
}