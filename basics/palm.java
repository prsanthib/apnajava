import java.util.Scanner;
class palm
{
    public static boolean pal(int n)
    {   int temp = n;
        int rem;
        int rev = 0;
        while (n > 0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        
        if (rev == temp)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean k = pal(x);
        System.out.println(k);
    }
}