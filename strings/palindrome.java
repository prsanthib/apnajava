//racecar,noon,madam
import java.util.*;
class palindrome
{
    public static boolean ispal(String pal)
    {
        for(int i = 0 ; i<pal.length(); i++)
        {
            if(pal.charAt(i) != pal.charAt(pal.length()-1-i))
            return false;                   
        }
        return true;
    }
    public static void main(String args[])
    {
        String pal = "racecar";
        boolean k = ispal(pal);
        System.out.println(""+k);

    }
}