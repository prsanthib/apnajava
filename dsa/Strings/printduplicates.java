import java.util.*;
class printduplicates
{
    public static StringBuffer duplicates(String str)
    {
        StringBuffer sc = new StringBuffer("");
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i ; j< str.length() ; j++)
            {
            if(str.charAt(i) == str.charAt(j) && i!=j)
            {
                if(!sc.contains(str.charAt(i)))
                {
                    sc.append(str.charAt(i));
                }
            } 
            }
        }
        return sc;
    }
    public static void main(String args[])
    {
        String str = "praprapra";
        System.out.println(duplicates(str));
    }
}