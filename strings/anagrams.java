/*import java.util.*;
class anagrams
{
    public static void main(String args[])
    {
        String str = "prashu";
        String str2 = "sapurh";
        int count = 0;
        for (int i = 0 ; i < str.length(); i++)
        {
            for (int j = 0 ; j< str2.length(); j++)
            {
                if (str.charAt(i) == str2.charAt(j))
                {
                    count ++;
                }
            }    
        }
        if (count == str.length())
        System.out.println("anagram");
        else 
        System.out.println("not anagram");
    }
}*/
import java.util.*;
class anagrams
{
    public static void main(String args[])
    {
        String str = "earth";
        String str2 = "heart";
        //convert to lower case
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        //convert into character array
        if(str.length() == str2.length())
        {
           char []ch1 = str.toCharArray();
            char []ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2))
            {
            System.out.println("anagrams");
            }
            else 
            {
                System.out.println("not anagrams");
            }
        }
        else
        {
            System.out.println("not anagrams");
        }

    }
}