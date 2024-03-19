import java.util.Scanner;
class breakk1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int x = sc.nextInt();
            if (x%10 == 0 )
            {
                System.out.println("Exit");
                break;
            }
        }
    }
}