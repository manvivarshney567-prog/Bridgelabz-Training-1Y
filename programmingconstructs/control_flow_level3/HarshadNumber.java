import java.util.Scanner;
class HarshadNumber

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n =sc.nextInt();
		int p=n;
		int sum=0;
		while(p!=0)
		{
			p=p%10;
			sum=sum+p;
			p=p/10;
			
		}
		if(n%sum==0)
		{
			
		
			System.out.println("HarshadNumber");
		}
		else
		{
			System.out.println("not HarshadNumber");
		}
	}
	
	

}