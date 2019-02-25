import java.util.Scanner;
public class p5
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner s=new Scanner(System.in);
	char ch=s.next( ).charAt(0);	 		
	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	{
		System.out.println("alphabet");
	}
	      else
	      {
		System.out.println("Not an alphabet");		
	}}
}
