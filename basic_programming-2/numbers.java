import java.util.Scanner;
class numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a:-");
		int a=sc.nextInt();
		System.out.println("Enter b:-");
		int b=sc.nextInt();
		float division=a/b;
		double modulus =a%b;
		System.out.println(" find division:-"+division);
		System.out.println("find Modulus:-"+modulus);

		

		
	}
}