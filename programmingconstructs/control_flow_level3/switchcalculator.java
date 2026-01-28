import java.util.Scanner;
class switchcalculator
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		double a=sc.nextDouble();
		System.out.println("enter second number");
		double b=sc.nextDouble();
		System.out.println("choose an operator(+,-,/,*):");
		char op=sc.next().charAt(0);
		switch (op)
		{
			case'+':
			System.out.println("result="+(a+b));
			break;
			case'-':
			System.out.println("result="+(a-b));
			break;
			case'*':
			System.out.println("result="+(a*b));
			break;
			case'/':
			if(b!=0)
			{
				
			    System.out.println("result="+(a/b));
			}
			else
			{
				System.out.println("division by zero is not allowed");
			}
			break;
			default:
			System.out.println("invalid operator");
		}
		
	}
}
