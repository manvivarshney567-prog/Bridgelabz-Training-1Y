import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		int p=n;
		int a=0;
		int sum=0;
		int count=0;
		while(p!=0)
		{
			a=p%10;
			sum=sum+a;
			p=p/10;
			count++;
		}
		
			System.out.println("count="+count);
	}
	
	

}