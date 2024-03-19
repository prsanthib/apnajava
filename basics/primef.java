import java.util.Scanner;
class primef
{
    public static String prime(int a)
    {   
        if (a==2)
        {
            return "prime";
        }
        else if(a==1)
        {
            return "not prime nor composite";
        }
        else{
         boolean isprime = true;
        for (int i = 2 ; i<= Math.sqrt(a) ; i++)
        {
            if (a%i == 0)
            { 
                isprime =false;
            }
        }
        if (isprime == true)
        {
            return "prime";
        }
        else{
            return "not prime";
        }
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //String k = prime(a);
        System.out.println(prime(a));
        
    }
}