import java.util.Scanner;
class profit
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price");
		int a=sc.nextInt();
		System.out.println("Enter selling price");
		int b=sc.nextInt();
		int profit = a - b;
		System.out.println("find Profit:-"+profit);
		double profit_percentage = profit*100/a;
		System.out.println("find Profit Percentage:-"+profit_percentage);
	}
}