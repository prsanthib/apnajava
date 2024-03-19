import java.util.Scanner;
import java.util.Random;
class es
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int Wcount = 0;
        int Rcount = 0;
        int count = 0;
        double percent = 0;
        int a,b,k = 0,ans = 0;

        while(count < 10)
        {
        a = ran.nextInt(10);
        b = ran.nextInt(10);
        System.out.println("How much is "+a+" plus "+b);
        k = a+b;       
        while(k != ans)
        {
        ans = sc.nextInt();
        if(k == ans)
        {
            Rcount++;
            int r1 = ran.nextInt(4);
            switch (r1)
            {
                case 0:
                    System.out.println("\"Very good\"");
                    break;
                case 1:
                    System.out.println("\"Excellent!\"");
                    break;
                case 2:
                    System.out.println("\"Nice Work!\"");
                    break;
                case 3:
                    System.out.println("\"Keep up the good work\"");
                    break;
                default:
                    System.out.println("hlo"); 
            }

        } else {    
            Wcount++;
            int r2 = ran.nextInt(4);
            
            switch (r2)
            {
                case 0:
                    System.out.println("\"No.Please try again\"");
                    break;
                case 1:
                    System.out.println("\" Wrong.Try once more\"");
                    break;
                case 2:
                    System.out.println("\"Don't give up\"");
                    break;
                case 3:
                    System.out.println("\"No.Keep trying\"");
                    break;
                default:
                    System.out.println("hlo"); 
            }

            if((Wcount + Rcount) == 10)
            {
                break;
            }
        }

        }
        count = Wcount + Rcount;
        System.out.println(count); 
        percent = (Rcount/10.0)*100;
    }

        System.out.println(percent);

        if(percent < 75)
        {
            System.out.println("\"Please ask your instructor for extra help\"");
        }
    }
} 