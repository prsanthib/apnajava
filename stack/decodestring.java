// 2[bv] == bvbv
//3[b2[v]]l = bvvbvvbvv
import java.util.*;
class decodestring
{
    public static void decode(String str)
    {
        Stack<Character> s = new Stack<>();
        Stack<Character> s1 = new Stack<>();
        String newStr = "";
        String string = "";
        //storing string in a stack
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == ']')
            {
                while(s.peek() != '[')
                {
                    s1.push(s.pop());
                }
                s.pop();
                int n = s.pop();
                while(!s1.isEmpty())
                {
                    newStr = newStr+s1.pop();
                }
                int count =1;
                while(count<n)
                {
                    string = string + newStr;                    
                }
                
                for(int j = 0 ; j< string.length() ; j++)
                {
                    s.push(string.charAt(j));
                }
                
                string = "";
                newStr = "";
                System.out.println("hello");
                
                
            } else{
                s.push(ch);
            }
        }
        
        System.out.println(string);
    }
    public static void main(String args[])
    {
        String str = "2[bv]";
        decode(str);    
    }
}
