// if parantheses are use less then they are duplicates
// (((a+b)-(v+d)+(k-e)))<- extra parantheses
//you will be given a valid string
import java.util.*;
class duplicateparantheses
{
    public static boolean duplicate(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            //closing
            if(ch == ')')
            {
            int count = 0;
            while(s.pop() != '(')
            {
                count++;
            }
            if(count<1)
            return true;
            }
             else
            {
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String args[])
    {
        String str = "(((A+B)+(C+D)))";
        System.out.println(duplicate(str));
    }
}