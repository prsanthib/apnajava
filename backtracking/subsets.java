import java.util.*;
class subsets
{
    public static void substring(String str , String ans , int i)
    {
        //base condition
        
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
            System.out.println("null");
            }
            else
            {
            System.out.println(""+ans);
            }
            return;
        }
        //yes condition
        substring(str,ans+str.charAt(i),i+1);
        //no condition
        substring(str,ans,i+1);
    }
    public static void main(String args[])
    {
        String a = "abc";
        substring(a,"",0);
    }
}