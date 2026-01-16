import java.util.Scanner;
class sam
{
	public static void main(String args [])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:-");
		double a =sc.nextInt();
		System.out.println("Enter second number:-");
		double b=sc.nextInt();
		System.out.println("Enter third number:-");
		double c=sc.nextInt();
		double average=(a+b+c)/3;
		System.out.println("find Average of three numbers:-"+average);
	}
	
}
 