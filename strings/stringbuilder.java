import java.util.*;
class stringbuilder
{
    public static void main(String args[])
    {
        StringBuilder sc = new StringBuilder("");
        for (char i = 'a' ; i< 'z';i++)
        {
            System.out.println(" "+sc.append(i));
        }
    }
}