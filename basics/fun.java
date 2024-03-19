/* functions are block of code used to perform a particular
task
by using functions we can do a particular actionmutliple times by 
calling the required function
*/
import java.util.Scanner;
class fun
{
    public static void sum(int a,int b) // a,b are parameters
    {                                  // formal parameters
        int sum = a+b;
        System.out.println("sum is "+sum);
        
    }
    public static int product(int a, int b)
    {
        int prod = a*b;
        return prod;
    }
    public static void hello()      //function definition
    {
        System.out.println("hello java");
    }
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       sum(num1,num2);     //num1 and num2 are arguments or actual parameters
       hello();         //function call
       int k = product(num1,num2);
       System.out.println("product is "+k);
    }
}