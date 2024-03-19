//sum of complex numbers
import java.util.*;
class comsum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE REAL AND IMAGINARY PARTS OF TWO COMPLEX NUMBERS");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        
        complex c = new complex();

        c.add(r1,i1,r2,i2);
        c.diff(r1,i1,r2,i2);
        c.prod(r1,i1,r2,i2);

    }
}
class complex
{
    public static void add(int r1 , int i1 , int r2 , int i2)
    {
       complexnum((r1+r2),(i1+i2));   
    }
    public static void diff(int r1 , int i1 , int r2 , int i2)
    {
       complexnum((r1-r2),(i1-i2));   
    }
    public static void prod(int r1 , int i1 , int r2 , int i2)
    {
       complexnum((r1*r2 - i1*i2), (r1*i2 + i1*r2));   
    }

    public static void complexnum(int r , int i)
    {
        if(r == 0)
        System.out.println(i+"i");
        else if(i == 0)
        System.out.println(""+r);
        else
        System.out.println(r+"+"+i+"i");
    }
    
}
