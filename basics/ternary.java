import java.util.Scanner;
class ternary
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = a>b ? "a is greater" :"b is greater" ;
        System.out.println(c);
        //int a = 10;
        //int b = 12;
        //String c = a>b ? "hello" : "hii" ;
        //System.out.println(c);
    }
}