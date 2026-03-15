/*Write a program to find the sum of n natural numbers using loop
*/
import java.util.Scanner;
class SumNaturalNumber
{
	int findSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;n++)
		{
			sum =sum+i;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		SumNaturalNumber obj =new
	    SumNaturalNumber();
		int result =obj.findSum(n);
		System.out.println("Sum="+result);
	}
}