import java.util.Scanner;
class spring
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month:");
		int month=sc.nextInt();
		System.out.println("Enter Day:");
		int Day=sc.nextInt();
		if(month ==3&&Day>=20)
		{
			System.out.println("It's a spring season:-");
		}
		else
		{
			System.out.println("Not a spring season:-");
		}
	}
		
		
}