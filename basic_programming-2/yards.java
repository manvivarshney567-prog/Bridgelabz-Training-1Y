import java.util.Scanner;
class yards
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in feet:-");
		double feet =sc.nextDouble();
		double yard=3*feet;
		System.out.println("convert feet into yard:-"+yard);
		double Miles=1760*yard;
		System.out.println("convert yard into Miles:-"+Miles);

		
	}
}
