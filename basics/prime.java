import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        if (num == 1)
        {
            System.out.println("neither prime nor composite");
        }
        else if (num == 2)
        {
            System.out.println("prime");
        }
        else
        {
            for (int i = 2; i<Math.sqrt(num) ; i++)
            {
                if (num%i == 0)
                    {
                    flag =1;
                    }
            
            }
            if (flag == 0)
            {
            System.out.println("PRIME");
            }
            else 
            {
            System.out.println("NOT PRIME");
            }
        }
    }
}