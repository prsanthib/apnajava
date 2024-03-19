class knights
{
    public static boolean issafe(char[][] board , int row , int col)
    {
        // 2top 1 right
        if(row > 1 && col >1 && row < board.length -2 && col < board.length-2)
        {
        if(board[row-2][col+1] == 'K')
        return false;
        //1top 2 right
        if(board[row-1][col+2] == 'k')
        return false;
        //2top 1 left
        if(board[row-2][col-1] == 'k')
        return false;
        //1top 2 left
        if(board[row-1][col-2] == 'K')
        return false;
        }
        return true;
    }
    public static void printboard(char[][] board)
    {
        System.out.println("_____________chessboard_________________");
        for(int i = 0 ; i<board.length ; i++)
        {
            for (int j = 0 ; j< board.length ; j++)
            {
                System.out.print(""+board[i][j]);
            }
            System.out.println();
        }
    }
    public static void nknights(char[][] board , int row)
    {
        if(row == board.length)
        {
            printboard(board);
            return;
        }
        for (int j = 0 ; j < board.length ; j++)
        {
            if (issafe(board , row, j))
            {
            board[row][j] = 'K';
            nknights(board , row+1);
            board[row][j] = 'X';
            }
        }
    }
    public static void main(String args[])
    {
        int n= 4;
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j< n ; j++)
            {
                board[i][j] = 'X';
            }
        }
        nknights(board , 0);
    }
}