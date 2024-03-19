//given a string return the max sum of palindromic subsequence of the string
import java.util.*;
class cr
{
   public static void helper(String s , String temp ,int index)
    {
        //base case
        if(s.length() == index)
        {
            System.out.println(temp+" ");
            return;
        }

        //take
        helper(s,temp+s.charAt(index),index+1);
        //not take
        helper(s,temp,index+1);

    }
    public static void main(String args[])
    {
        String s = "prashu";
        helper(s,"",0);
        
    }
}