/*import java.util.*;
class swap
{
    public static void main(String args[])
    {
        int a = 5;
        int b = 10;
        System.out.println("a is "+a+" b is "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a is "+a+" b is "+b);
    }
}*/
import java.util.*;
class swap
{
    public static void main(String args[])
    {
        int x = 5; //101
        int y = 6; //110
        x = x^y; //
        y = x^y;
        x = x^y;
        System.out.println("x is "+x+" y is "+y);

    }
}