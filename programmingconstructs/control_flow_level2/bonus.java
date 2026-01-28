import java.util.Scanner;
class bonus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		System.out.println("Enter yearofservice");
		int yearofservice=sc.nextInt();
		if(yearofservice>5)
		{
			double bonus=salary*0.05;
			System.out.println("Boonus for employees:;"+bonus);
		}
		else
		{
			System.out.println("bonus not required");
		}
	}
	
}