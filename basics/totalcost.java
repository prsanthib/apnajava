import java.util.Scanner;
public class totalcost
{
public static void  main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println ("ENTER THE COST OF PENCIL");
int a = sc.nextInt();
System.out.println ("ENTER THE COST OF PEN");
int b = sc.nextInt();
System.out.println ("ENTER THE COST OF BOOK");
int c = sc.nextInt();
System.out.println("TOTAL COST IS");
int d = a+b+c;
System.out.println (d);
System.out.println ("THE COST OF TOTAL ITEMS INCLUDING 18% OF GST IS");
double $ =d + ((d*18)/100.0);
System.out.println($);  // $ gives no error cause its also used as an identifier in java

}
}