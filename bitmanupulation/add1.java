/* we know that in bitwise operators ~n gives -(n+1)
for ~5 = -6;
so to get 6 we multiply ~5 by -
~ means it converts all the zeroes into 1s and 1s to 0s
 5 is 00000101
~5 is 11111010
to find the magnitude as the most signifant bit is 1 ie it is a negative number
so we invert all the zeroes and add 1
             11111010 ---------P
magnitude is 00000101
                +   1
             00000110   so its value is 6 and as p has msb 1 so the ans is -6
*/
import java.util.*;
class add1
{
    public static void main(String args[])
    {
        int n =5;
        System.out.println(n+" + 1 is "+-(~n));
    }
}