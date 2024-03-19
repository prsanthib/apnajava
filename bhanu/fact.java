import java.util.*;
import java.math.*;
class fact
{
    public static BigInteger fact(BigInteger n)
    {
        if(n == BigInteger.valueOf(0))
        {
            return BigInteger.valueOf(1);
        }

        BigInteger b = fact(n.subtract(BigInteger.valueOf(1)));
        return n.multiply(b);
    }
    public static void main(String args[])
    {
        BigInteger n = BigInteger.valueOf(100);
        System.out.println(fact(n));
    }
}