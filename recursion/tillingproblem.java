/*//in this sum,a couch is given  whose width is 2 and length is n 2*n
//and tiles were given with length 2 and width 1 i.e. 2*1
//we have to return the no of ways the tiles can be arranged in the couch where n(length) is given
class tillingproblem
{
    public static int tilling(int n)
    {
        //base condition
        if(n == 0 || n == 1)
        return 1;
        //if tiles are placed in vertical direction
        int vertical = tilling(n-1);

        //if tiles are placed horizontal.if a tile is placed horizontal
        //then other tile below it should be horizontal and it cannot be vertical 


    }
    public static vod main(String args[])
    {
        tilling(5);
    }
}*/
class tillingproblem
{
    public static int tilling(int x)
    {
        //base condition
        if(x == 0 || x == 1)
        return 1;
        //if the tiles are arranged in verical direction
        int vertical = tilling(x-1);
        //if tiles are arranged in horizontal direction
        int horizontal = tilling(x-2);

        int total = vertical + horizontal;

        return total;
    }
    public static void main(String args[])
    {
        System.out.println(""+tilling(5));
    }
}