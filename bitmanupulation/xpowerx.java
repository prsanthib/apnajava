//x^x == x xor x
import java.util.*;
class xpowerx
{
    public static int power(int x)
    {
        int ans = 1;
        int a = x;
        int b = x;
        //a^b
        while(b>0)
        {
            if((b&1)!= 0)
            {
                ans = ans *a;
            }
            a = a*a;
            b = b>>1;
        }return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        System.out.println(power(x)+"");
    }
}