class intern
{
    public static void main(String args[])
    {
        String s1 = "HELLO WORLD";
        String s2 = s1.intern();
        String s3 = "HELLO WORLD";
        String s4 = new String("HELLO WORLD").intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }
}