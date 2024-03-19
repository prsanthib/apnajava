import java.util.*;
class validparantheses
{
    public static boolean isvalid(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '(')
            {
                s.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {
                if(s.isEmpty())
                {
                    return false;
                }
                if(s.peek() == '(' && ch == ')' || s.peek() == '[' && ch == ']' || s.peek() == '{' && ch == '}')
                {
                    s.pop();
                }
            }
            else
            {
                System.out.println("INVALID");
            }
        }
        if(s.isEmpty())
        return true;

        return false;    
    } 
    public static void main(String args[])
    {
        String str = "[{((({})))}]";
        System.out.println(isvalid(str));
    }
}