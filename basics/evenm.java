import java.util.Scanner;
class evenm
{
    public static boolean even(int n)
    {
       if (n%2 == 0)
       {
        return true;
       }
       else 
       {
        return false;
       }
       
    }
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean k = even(n);
        System.out.println(k);
        
        if((even(n) == true && n%2==0) || (even(n)== false && n%2!=0))
        {
            System.out.println("method checked and its true");
        } 
    }
}