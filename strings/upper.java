/*converting 1st letter of every word to capital
1st we take an empty string in string builder and we check if space is encountered
if space is encountered at an index then the next character is capitalized*/
import java.util.*;
class upper
{
    public static String uppercase(String str)
    {
        StringBuilder sc = new StringBuilder("");
        sc.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i < str.length(); i++)
        {
            if(str.charAt(i) ==' '&& i < str.length()-1)
            {
                sc.append(str.charAt(i));
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();
    }
    public static void main(String args[])
    {
        String str = "prasanthi is a good girl";
        System.out.println(" "+uppercase(str));
    }
}