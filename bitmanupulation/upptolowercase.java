//syso((char)(c | ' ')) converts uppercase to lowercase
import java.util.*;
class upptolowercase
{
    public static void main(String args[])
    {
        for(char ch = 'A';ch <= 'Z' ; ch++)
        {
            System.out.print((char)(ch | ' '));
        }
        System.out.println();
        char c = 'M';
        System.out.println((char)(c | ' '));
    }
}