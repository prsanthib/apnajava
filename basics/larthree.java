import java.util.Scanner ;
class larthree
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("a IS LARGER "+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("b IS LARGER "+b);
        }
        else 
        { 
            System.out.println("c IS LARGER "+c);
        }
        
    }
}