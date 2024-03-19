import java.util.Scanner;
class sorting
{
    public static void bubble(int a[], int n)
    {
        for (int i = 0 ; i<n ;i++)
        {
            for (int j = 0 ;j < n-1-i ; j++)
            {
                if (a[j] < a[j+1])
                {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                }
            }
        }
    }
    public static void selection(int a[], int n)
    {
        for (int i = 0 ; i<n-1 ; i++)
        {
            int max = a[i];
            for (int j = i+1 ; j<n-1 ; j++)
            {
                if (a[j]> max)
                {
                 max = a[j];
                }
            }
            int temp = a[i];
            a[i] = max;
            max = temp;
        }
    }
    public static void insertion(int a[] , int n)
    {
        for (int i = 0 ; i<n-1 ; i++)
        {
            int curr = a[i];
            int prev = i-1;
            while(prev >=0 && curr>a[prev])
            {
                 a[prev+1] = a[prev];
                 prev --;
            }
            a[prev + 1] = curr;

        }
    }

    public static void printa(int a[], int n)
    {
        for (int i = 0 ;i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void count(int a[] , int n)
    {   
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ;i<n;i++)
        {
            largest = Math.max(largest,a[i]);
        }
        // count
        int count[] = new int[largest+1];
        for (int i = 0 ; i< n ;i++)
        {
            count[a[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0 ;i < count.length ; i++)
        {
            a[j] = i;
            j++;
            count[i]--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO OF ELEMENTS");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0 ; i< n ;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("AFTER BUBBLE SORT");
        bubble(a,n);
        printa(a,n);
        System.out.println("AFTER SELECTION SORT");
        selection(a,n);
        printa(a,n);
        System.out.println("AFTER INSERTION SORT");
        insertion(a,n);
        printa(a,n);
        /*System.out.println("AFTER COUNT SORT");
        count(a,n);
        printa(a,n);*/
        
    }
}
