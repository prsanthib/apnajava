import java.util.Scanner;
class mult
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int tab = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(tab+"*"+i+"="+tab*i);
        }
    }
}