import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       switch(a)
       {
        case 1:
              System.out.println("BURGER");
              break;
        case 2:
              System.out.println("PIZZA");
              break;
        default:
              System.out.println("SAMOSA");

       }
    }
}