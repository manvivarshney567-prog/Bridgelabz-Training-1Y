import java.util.Scanner;
class natural2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		
		if(n<=0)
		{
			System.out.println("Not a natural number");
			return;
		}
		int SumLoop=0;
		for(int i=1;i<=n;i++)
		{
			SumLoop+=i;
		}
		int SumFormulae=n*(n+1)/2;
		
		System.out.println("Sum using loop:-"+SumLoop);
		System.out.println("Sum using Formulae:-"+SumFormulae);
		if(SumLoop==SumFormulae)
		{
			System.out.println("Result is correct");
		}
		else
		{
			System.out.println("Result is not correct");
		}
	}
}