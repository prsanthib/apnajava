import java.util.Scanner;
class maxprofit
{
public static int max(int a[] , int n)
{
    int bp = Integer.MAX_VALUE;
    int max = 0; //insted of initilizing min value if we initilize 0 the if there are no transactions then it returns 0
    for (int i = 0 ; i< n ;i++)
    {
        if (bp < a[i])
        {
            int profit = a[i] - bp;
            max = Math.max(max,profit);
        }
        else 
        {
            bp = a[i];
        }
        
    }
    return max;
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
        int k = max(a,n);
        System.out.println("max profit "+k);
    }
}    