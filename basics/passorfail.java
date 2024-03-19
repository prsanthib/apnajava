import java.util.Scanner;
class passorfail
{
    public static void main (String args[])
    {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String b = a > 33 ? "pass" : "fail" ;
        System.out.println(b);
    }
}