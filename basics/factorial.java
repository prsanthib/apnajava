import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int fact = 1;
     if (a == 0)
     {
        System.out.println(1);
     }
     else
     {
     for (int i =1;i<=a;i++)
     {
       fact = fact*i;
     }
     System.out.println(fact);
     }
    }
}