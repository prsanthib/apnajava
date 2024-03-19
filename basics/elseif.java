import java.util.Scanner;
class elseif
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=18)
        {
         System.out.println("hii sir/mam");
        }
        else if (age >=13 && age < 18)
        {
            System.out.println("hey good to see you teenager");
        }
        else
        {
            System.out.println("chote bache yaha nahi anachahiye oops");
        }
    }
}