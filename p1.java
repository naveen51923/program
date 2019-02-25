import java.util.Scanner;
public class PROG
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0)
        {
            System.out.print("Positive");
        }
        else if(a==0)
        {
             System.out.print("Zero");
        }
        else if(a<0)
        {
             System.out.print("Negative");
        }
    }
}
