import java.util.*;
class duplicatechar
{
    public static void duplicate(String str, StringBuilder str2,int index,boolean arr[])
    {
        if(index == str.length())
        {
            System.out.println(str2);
            return;
        }
        int k = str.charAt(index) - 'a';
        if(arr[k] == true)
        {
            duplicate(str,str2,index+1,arr);
        }
        else
        {
            arr[k] = true;
            duplicate(str,str2.append(str.charAt(index)),index+1,arr);
        }
    }
    public static void main(String args[])
    {
        String str = "appnnaajjaavva";
        StringBuilder str2 = new StringBuilder("");
        duplicate(str,str2,0,new boolean[26]);


    }
}