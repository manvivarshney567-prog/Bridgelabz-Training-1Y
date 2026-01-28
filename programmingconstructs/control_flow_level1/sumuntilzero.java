import java.util.Scanner;
class sumuntilzero
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		double a=sc.nextDouble();
		double total=0.0;
		
		while(a!=0)
		{
			total +=a;
	    }
		System.out.println("the total sum is:" +total);
		
	}
}
