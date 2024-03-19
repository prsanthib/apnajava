import java.util.*;
class bitwiseoperators
{
    public static void main(String args[])
    {
        int a = 4;//100
        int b = 5;//101
        System.out.println(""+(a&b)); // 100 = 4
        System.out.println(""+(a|b)); // 101 = 5
        System.out.println(""+(a^b)); // 001 = 1
        System.out.println(""+(~a)); //1111011 = -5
        System.out.println(""+(a<<1));
        System.out.println(""+(b>>1));
    }
}