import java.util.Scanner;
class sumofn
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int sum = 0;
        int n = sc.nextInt();
        while (x <= n)
        {
            sum = sum + x;
            x++;
        }
        System.out.println("sum of "+n+" natural numbers is "+sum);
    }
}