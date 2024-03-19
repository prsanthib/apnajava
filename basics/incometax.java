// income <5L = 0%tax
// income >5L && <10L = 20%tax
// income >10L = 30%tax
import java.util.Scanner;
class incometax
{
    public static void main(String args[])
    {
      double tax;
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER YOUR INCOME PER YEAR");
      long income = sc.nextLong();
      if (income < 500000)
      {
        //System.out.pritnln("CONGRATS no income tax");
        tax = 0;
         System.out.println("your income tax is"+tax);
      }
      else if (income >= 500000 && income <1000000)
      {
        tax = income * (20/100.0);
      System.out.println("Your income tax is"+tax);
      }
      else 
      {
        tax = income * (30/100.0);
        System.out.println("Your income tax is"+tax);
      }

    }
}