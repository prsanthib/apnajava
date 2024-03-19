import java.util.Scanner;
public class avg 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
double avg = (a+b+c)/3.0;
System.out.println(avg);
}
}