import java.util.Scanner;
class arrpairs
{
   public static void pairs(int a[])
    {
        for (int i = 0;i<a.length;i++)
        {
            int curr = a[i];
            for (int j = i+1;j<a.length ; j++)
            {
                int k = a[j];
                System.out.println("("+curr+","+k+")");
            }
        }
    }
   /* public static void pairs(int a[])
    {
        for (int i = 0;i<a.length;i++)
        {
        System.out.println("("+a[i]+","+a[i+1]+")");
        }
    }*/
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NO OF ELEMENTS IN ARRAY");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ELEMENTS OF THE ARRAY");
        for (int i = 0 ; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        pairs(a);
    }
}