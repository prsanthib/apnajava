import java.util.*;
class reversestring 
{
    public static String reverse(Stack<Character> sc ,String str)
    {
        StringBuilder s = new StringBuilder("");
        while(!sc.isEmpty())
        {
            s.append(sc.pop());
        }
        return s.toString();
    }
    public static void main(String args[])
    {
        Stack<Character> sc = new Stack<>();
        String str = "PRASANTHI";
        int idx = 0;
        while(idx < str.length())
        {
            sc.push(str.charAt(idx));
            idx++;
        }
        System.out.println(reverse(sc,str));
    }
}