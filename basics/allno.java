import java.util.Scanner;
class allno
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      while(true)
      {
        System.out.println("ENTER NUMBER");
        int num = sc.nextInt();
        if (num%10 == 0)
        {
           continue;
        }
        System.out.println(num);
      }  
    }
}