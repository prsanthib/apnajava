class spiralmat
{
    public static void spiral(int arr[][])
    {
        int startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;

        while(startrow <= endrow && startcol <= endcol)
        {
            //top
            for (int i = startcol ; i<=endcol ; i++)
            {
                System.out.print(arr[startrow][i]+" ");
            }
            //right
            for (int i = startrow+1; i<=endrow ; i++)
            {
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for (int i = endcol -1 ; i >= startcol ; i--)
            {
                System.out.print(arr[endrow][i]+" ");
                if(startcol == endcol)
                break;
            }
            //left
            for (int i = endrow-1 ; i>=startrow+1 ; i--)
            {
                System.out.print(arr[i][startcol]+" ");
                if (startrow == endrow)
                break;
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
    public static void main(String args[])
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        spiral(arr);
    }
}