import java.util.Scanner;
class sumsubarray
{
    public static void maxsum(int a[])
    {   
        int currsum=0;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i<a.length;i++)
        {   
            int start = i;
            for (int j = i ; j<a.length;j++)
            {   
                int end = j;
                currsum = 0;
                for (int k =start;k<=end ; k++ )
                {
                    currsum += a[k];
                }
                System.out.println("CURRENT SUM IS  "+currsum);
                if (max<currsum)
                {
                    max = currsum;
                }
            }
            
        }
        System.out.println("max sum of subarray is "+max);
        
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
        maxsum(a);
    }
}