/*import java.util.Scanner;
class subarraysummax
{
    
    public static void submax(int a[])
    {  
        int maxsum = Integer.MIN_VALUE;
        int currsum=0;
        //calculating prefix
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for (int i = 1;i<a.length;i++)
        {
            prefix[i] = prefix[i-1]+a[i]; 
        }


        for (int i = 0 ;i<a.length;i++)
        {
            int start = i;
        int j;
        for (j = i ; j<a.length ; j++);
        {
            int end = j;
            
            currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            if (maxsum < currsum)
            {
                maxsum = currsum;
            }
        }
        }
     System.out.println("max sum is "+maxsum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETR NO OF ELEMENTS IN ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i = 0;i< n ; i++)
        {
            a[i] = sc.nextInt();
        }
        submax(a);
    }
*/
import java.util.Scanner;
class sumsubarray
{
    public static void maxsum(int a[])
    {   
        int currsum=0;
        int max = Integer.MIN_VALUE;
         int prefix[] = new int[a.length];

        prefix[0] = a[0];
        //calculate prefix
        for (int i = 1;i<a.length;i++)
        {
            prefix[i] = prefix[i-1]+a[i]; 
        }

        for (int i = 0 ;i<a.length;i++)
        {   
            int start = i;
            for (int j = i ; j<a.length;j++)
            {   
                int end = j;
                
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

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