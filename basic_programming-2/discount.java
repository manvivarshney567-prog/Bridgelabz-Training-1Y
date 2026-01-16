import java.util.Scanner;
class discount
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fees:-");
		int Fees =sc.nextInt();
		System.out.println("Enter discount(%):-");
		int discount=sc.nextInt();
		int Amount =(discount*Fees)/100;
		System.out.println("Discount Amount:-"+Amount);
		int price =Fees -Amount;
		System.out.println("Discount price:-"+price);
		
	}
}