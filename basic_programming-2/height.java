import java.util.Scanner;
class height
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in cm:-");
		int cm=sc.nextInt();
		double inch=2.54*cm;
		System.out.println("convert cm into inch:-"+inch);
		double feet=12*inch;
		System.out.println("convert inch into feet:-"+feet);
		
		
		
	}
}