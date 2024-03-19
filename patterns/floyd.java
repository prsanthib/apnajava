import java.util.Scanner;
class floyd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 1;
        for (int i = 1;i<=a;i++)
        {
            for (int j =1; j<=i;j++)
            {
                System.out.print(n+"\t");
                n++;
            }
            System.out.println();
        }
    }
}