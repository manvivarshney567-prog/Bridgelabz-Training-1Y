import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value a:-");
		int a=sc.nextInt();
		System.out.println("Enter value b:-");
		int b=sc.nextInt();
		int sum=a+b;
		int subtract=a-b;
		int multiplication=a*b;
		int division=a/b;
		System.out.println("Addition:-"+sum);
		System.out.println("subtraction:-"+subtract);
		System.out.println("mutilply:-"+multiplication);
		System.out.println("divide:-"+division);

		

		
	}
}