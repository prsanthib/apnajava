import java.util.Scanner;
class cp 
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp > 100)
        {
            System.out.println("you have fever");
        }
        else 
        {
            System.out.println("You do not have fever");
        }
    }
}