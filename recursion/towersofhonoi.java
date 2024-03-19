//here we have to find the no of steps so that only a single weight can be moved to
//destinaion from the surroundings by using auxilary
class towersofhonoi
{
    public static void towers(char src, char dest , char aux,int n)
    {
        if(n == 1)
        {
            System.out.println("from "+src+" to"+dest);
            return;
        }
        //transfer n-1 weights from source to auxilary using destination as aux
          towers(src,aux,dest,n-1);
          //transfer 1 from src to dest
          System.out.println("from "+src+" to"+dest);
          //transfer n-1 from aux to dest
          towers(aux,dest,src,n-1);
         
    }
    public static void main(String args[])
    {
        towers('A','C','B',4);
    }
}