//first non repeating char int a string
import java.util.*;
class fnon
{
    public static void non(String str)
    {
        Queue<Character> q = new LinkedList<>();
        int frequency[] = new int[26];

        for(int i = 0 ; i< str.length() ;i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            frequency[ch-'a']++;
            while(!q.isEmpty() && frequency[q.peek()-'a']>1)
            {
                q.remove();
            }
            if(q.isEmpty())
            {
                System.out.print(-1);
            }
            else
            {
                System.out.print(" "+q.peek());
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String str = "aabccxb";
        non(str);
    }
}