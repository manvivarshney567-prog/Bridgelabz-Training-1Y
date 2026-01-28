import java.util.Scanner;
class positive
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		if(a>0)
		{
			
			
		    System.out.println("no. is positive");
		}
		else if(a==0)
		{
			System.out.println("no. is zero");
		}
		else if(a<0)
		{
			System.out.println("no. is negative");
		}
	}
}
		
		