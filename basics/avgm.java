import java.util.Scanner;
class avgm 
{   
    public static void avg(int a,int b,int c)
    {
      double avg = (a+b+c)/3;
      System.out.println("avg is "+avg);
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a,b,c);
    }
}