class arr
{
    public static void main(String args[])
    {
    int a[][] = {{1,2,3,4,5},{4,5,6,7,8},{0,9,8,7,5},{2,6,3,6,4}};
    for (int i = 0 ; i < 4 ; i++)
    {
        for (int j = 0 ; j< 5; j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }
    }
}