/*
import java.util.*;
class compress
{
    public static String com(String str)
    {
        String newString = "";
        for (int i = 0 ; i<str.length();i++)
        {
            Integer count = 1;
            newString += str.charAt(i);
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
                
            }
            
            if (count > 1)
            {
              newString += count;  
            }
            else 
            {
                newString += str.charAt(i);
            }
        }
        return newString.toString();
    }
    public static void main(String args[])
    {
        String str = "aaabbbbcccccdd";
        System.out.println(com(str)+" ");
    }
}
*/
import java.util.*;
class compress
{
    public static StringBuffer com(String str)
    {
        StringBuffer sc = new StringBuffer("");
        for (int i = 0 ; i< str.length();i++)
        {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count ++;
                i++;
            }
            sc.append(str.charAt(i));
            if (count > 1 )
            {
                sc.append(count.toString());
            }

        }
        return sc;

    }
    public static void main(String args[])
    {
        String str = "pppphhhhdddll";
        System.out.println(com(str)+"");
    }
}