import java.util.Scanner;
public class p2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<0)
        {
            System.out.print("invalid");
        }
        else 
        {
            if(a%2!=0 )
        {
            System.out.print("odd");
        }
        else
        {
            System.out.print("even");
     }   }
    }
}
