import java.util.Scanner;
class week
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY DIGIT FROM 1 TO 7");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println("MONDAY");
            break;
            case 2:
            System.out.println("TUESDAY");
            break;
            case 3:
            System.out.println("WEDNESDAY");
            break;
            case 4:
            System.out.println("THURSDAY");
            break;
            case 5:
            System.out.println("FRIDAY");
            break;
            case 6:
            System.out.println("SATURDAY");
            break;
            case 7:
            System.out.println("SUNDAY");
            break;
        }    
    }
}