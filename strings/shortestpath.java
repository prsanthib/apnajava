//displacement is squarerootof((x1-x2)^2 + (y1-y2)^2)
import java.util.*;
class shortestpath
{
    public static float shortpath(String str)
    {
        int x = 0 ;
        int y = 0 ;
        for (int i = 0;i<str.length();i++)
        {
            char dir = str.charAt(i);
            
            if (dir == 'S')
            {
                y--;
            }
            else if (dir == 'N')
            {
                y++;
            }
            else if (dir == 'E')
            {
                x++;
            }
            else if(dir == 'W')
            {
                x--;
            }
            else 
            {
                System.out.println("invalid");
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[])
    {
        String str = "NNNNNN";
        float k = shortpath(str);
        System.out.println(""+k);
    }
}