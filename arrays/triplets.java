import java.util.Scanner;
class triplets
{
    public static void trip(int a[] , int n)
    {
       for (int i = 0 ;i < n ; i++)
       {
            //int start = i;
            for (int j = i+1 ; j<n ;j++)
            {
                //int end = j;
                for (int k = i+2 ;k < n ; k++)
                {
                    if (a[i]+a[j]+a[k] == 0)
                    {
                   System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
                    }
                        
                }
                 
            }
           
       }
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
        trip(a,n);
    }
}