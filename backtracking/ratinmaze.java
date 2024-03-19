class ratinmaze
{
    public static boolean issafe(int maze[][] , int visited[][],int row,int col)
    {
        if(row >= 0 && col >= 0 && row < maze.length && col <  maze[0].length && maze[row][col] == 1 && visited[row][col] == 0)
        {
            return true;
        }
        return false;
    }
    public static String rat(int maze[][] , int visited[][] , int row , int col,String ans)
    {
        if(row == 3 && col == 3)
        {
            return ans;
        }

        visited[row][col] = 1;
        if(issafe(maze,visited,row+1,col))
        {
        rat(maze,visited,row+1,col,ans);
          return ans.concat("D");
        }
        if(issafe(maze,visited,row,col-1))
        {
            rat(maze,visited,row,col-1,ans);
            return ans.concat("L");
        }
         if(issafe(maze,visited,row,col+1))
        {
            rat(maze,visited,row,col+1,ans);
           return ans.concat("R");
        }
         if(issafe(maze,visited,row-1,col))
        {
            rat(maze,visited,row-1,col,ans);
            return ans.concat("U");
        }
        visited[row][col] = 0;
    return "f";
    }
    public static void main(String args[])
    {
        int n = 4;
        int maze[][] = {{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        int visited[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
       System.out.println(""+rat(maze,visited,0,0,""));
    }
}