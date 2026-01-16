import java.util.Scanner;
class amount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee");
		double fee =sc.nextDouble();
		System.out.println("Enter discountpercent");
		double discountpercent =sc.nextInt();
		double discount = fee*discountpercent/100;
		System.out.println("find Discount :-"+discount);
		double finalfee= fee - discount;
		System.out.println("find final fee :-"+finalfee);

	}
}