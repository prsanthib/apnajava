import java.util.*;
import java.lang.*;
class sumeo
{
    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        int esum = 0,osum = 0;
        do{
        System.out.println("ENTER NUMBER");
        int x = sc.nextInt();
        if (x%2 == 0)
        {
            esum = esum + x;
        }
        else
        {
            osum = osum + x;
        }
        System.out.println("ENTER 1 TO CONTINUE");
        a = sc.nextInt();
        }while(a==1);
        
        System.out.println("sum of even int is"+esum);
        System.out.println("sum of odd int is "+osum);
    }
}