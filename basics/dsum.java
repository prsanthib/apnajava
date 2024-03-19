import java.util.*;
class dsum
{
    public static void sd(int x)
    {
        int sum = 0;
        while(x!=0)
        {
           int n = x%10;
           sum = sum + n;
           x = x/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sd(x);
    }
}