import java.util.*;
import java.util.String;
class validpalindrome
{
    public static boolean palindrome(String str)
    {
        String str2 = str.reverse();
        if(str == str2)
        return true;

        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to check");
        String str = sc.nextLine();
        palindrome(str);
    }
}