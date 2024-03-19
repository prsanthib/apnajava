import java.util.Scanner;
class revp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int num = sc.nextInt();
        int rev = 0;
        while(num != 0)
        {
        int rem = num%10;
        num = num/10;
        System.out.print(rem);
        }
    }
}