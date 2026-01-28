import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Not a factorial number");
			return;
		}
		long fact=1;
		int i =1;
		while(i<=num)
		{
			fact*=i;
			i++;
		}
		System.out.println("factorial:"+fact);
	}
}