//By using this timecomplexity will be (log n)+1 else it is n
//here n is exponent
import java.util.*;
class fastexponentiation
{
    public static int exp(int a,int n)
    {
        int ans = 1;
        while(n>0)
        {
            if((n&1) != 0)
            {
                ans = ans * a;
            }
            a=a*a;
            n = n>>1;
        }return ans;
    }
    public static void main(String[] args)
    {
        int a = 3;
        int n = 5;
        //3^5
        System.out.println(""+exp(a,n));
    }
}