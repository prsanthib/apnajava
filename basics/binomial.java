import java.util.Scanner;
class binomial
{
    public static int fact(int a)
    {
        int fact = 1;
        if(a==0)
        {
        fact = 1;
        }
        else if (a > 0)
        {   
            for (int i = 1 ; i <= a ; i++)
            {
                fact = fact*i;
            }
             
        }
        return fact;
    }
    public static double binco(int n, int r)
    {
        double binco = fact(n)/(fact(r)*fact(n-r));
        
        return binco;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N OF BINCO");
        int n = sc.nextInt();
        System.out.println("ENTER R OF BINCO");
        int r = sc.nextInt();
        double k = binco(n,r);
        System.out.println("the biomial coffecient "+k);
        

    }
}