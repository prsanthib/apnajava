import java.util.*;
class primeinrange
{
    public static boolean prime(int a)
    {   
        boolean isprime = true;
        if (a==2)
        {
            isprime =  true;
        }
        else if(a==1)
        {
            isprime = false;
        }
        else
        {
         for (int i = 2 ; i<= Math.sqrt(a) ; i++)
            {
                if (a%i == 0)
                { 
                    isprime =false;
                }
            }
        }
        return isprime;
    }
    public static void primein(int m,int n)
    {
        for (int i =m;i<=n;i++)
        {
           if (prime(i) == true)
            {
                System.out.print(i+" ");
            } 
        }    
    
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        primein(a,b);
        
    }
}