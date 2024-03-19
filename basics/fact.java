import java.util.Scanner;
class fact
{
    public static void fact(int a)
    {
        int fact = 1;
        if(a==0)
        {
            System.out.println("factorial of number is "+1);
        }
        else if (a > 0)
        {   
            for (int i = 1 ; i <= a ; i++)
            {
                fact = fact*i;
            }
        }
        else
        {
            System.out.println("negative no do not hae factoria");
        }
        System.out.println("factorial of the number is "+fact);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a = sc.nextInt();
        fact(a);

    }
}