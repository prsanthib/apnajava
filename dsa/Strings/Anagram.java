/*import java.util.*;
class Anagram
{
    public static void main(String args[])
    {
        String str = "hprashurt";
        String str2 = "earth";
        //convert to lower case
        str.toLowerCase();
        str2.toLowerCase();
        //convert to the array
        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();
        //check if they ar equal
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length != ch2.length)
        {
            System.out.println("not anagrams");
            return;
        }

            if(Arrays.equals(ch1,ch2))
            {
                System.out.println("anagrams");

            }
            else{
                System.out.println("not anagrams");
            }
            /*
            for(int i = 0 ; i< ch1.length; i++)
            {
            if(ch1[i] != ch2[i])
            {
            System.out.println("not anagrams");
            return;
            }
        }
        System.out.println("anagramas");
        
}
}
*/
import java.util.*;
class Anagram
{
    public static void main(String args[])
    {
        String str = "clar";
        String str2 = "rac";
        if(str.length() == str2.length())
        {
            //convert to lower case
            str.toLowerCase();
            str2.toLowerCase();
            //convert to arrays
            char ch1[] = str.toCharArray();
            char ch2[] = str2.toCharArray();
            //sort the arrays
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2))
            {
                System.out.println("these are anagrams");
            }
            else{
                System.out.println("Strings are not anagrams");
            }
        }
        else
        {
            System.out.println("Strings are not anagrams");
        }
    }
}