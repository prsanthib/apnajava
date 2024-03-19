import java.util.Scanner;
class leap
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int year = sc.nextInt();
     boolean x = (year % 4) == 0;
     boolean y = (year % 100) != 0;
     boolean z = (year % 100 == 0 )&& (year % 400 == 0) ;
     
     if (x && (y||z))
     {
        System.out.println("LEAP YEAR");
     }
     else 
     {
        System.out.println("NOT A LEAP YEAR");
     }
    }
}