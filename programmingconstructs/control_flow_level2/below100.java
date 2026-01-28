import java.util.Scanner;
class below100
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		int i;
		if(n>1&&n<=100)
		{
			for(i=100;i>=n;i--)
			{
				if(i%n==0)
				{
					System.out.println("the multiples are"+i);
				}
			}
		}
	}
}