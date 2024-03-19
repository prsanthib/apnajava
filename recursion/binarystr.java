/*class binarystr 
{
    public static void k(int n ,int lastplace ,String str)
    {
        //base
        if (n == 0){
        System.out.println(str);
        return;
        }
        //kam
        k(n-1 , 0 , str+"0");
        if(lastplace == 0)
        {
            k(n-1 , 1, str+"1");
        }
    }

    public static void main(String args[])
    {
        k(4,0,"");
    }
}*/
class binarystr
{
    public static void binarystring(int n,String str,int lastplace)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        binarystring(n-1,str+"0",0);
        if(lastplace == 0)
        {
            binarystring(n-1,str+"1",1);
        }
    }
    public static void main(String args[])
    {
        binarystring(3,"",0);
    }
}