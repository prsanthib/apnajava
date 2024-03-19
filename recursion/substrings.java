//we have to print the sub strings which are starting and ending with the same character
class substrings
{
    public static int k = 0;
    public static int subs(String str,int i,int j,int n)
    {
        if(n == 1)
        return 1;
        if(n <= 0)
        return 0;
        int res = subs(str,i+1,j,n-1)+subs(str,i,j-1,n-1)-subs(str,i+1,j-1,n-2);
        if(str.charAt(i) == str.charAt(j))
        res++;
        return res;
    }
    public static void main(String args[])
    {
        String str = "abacb";
        int n = str.length();
        System.out.println(subs(str,0,n-1,n));
    }
}