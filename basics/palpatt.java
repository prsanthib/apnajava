import java.util.Scanner;
class palpatt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1;j<=n-i;j++ )
            {
                System.out.print(" ");
            }
            for (int j = i ; j>=2;j--)
            {
                System.out.print(j);
            }
            for (int k = 1 ; k<=i ; k++)
            {
                System.out.print(k);
            }
        System.out.println();
        }
    }
}