import java.util.Scanner;
class subjects
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phy no.");
		double phy=sc.nextDouble();
		System.out.println("enter chem no.");
		double chem=sc.nextDouble();
        System.out.println("enter math no.");
		double math=sc.nextDouble();
		double pp=((phy+chem+math)/300)*100;
		System.out.println("the required percentage="+pp);
		if(pp>=80)
		{
			System.out.println("above agency_normalized standard");
		}
		else if(pp>=70&&pp<=79)
		{
			System.out.println("at agency_normalized standard");
		}
		else if(pp>=60&&pp<=69)
		{
			System.out.println("below,but approaching_agency_normalized standard");
		}
		else if(pp>=50&&pp<=59)
		{
			System.out.println("well below agency_normalized standard");
		}
		else if(pp>=40&&pp<=49)
		{
			System.out.println("too agency_normalized standard");
		}
		else
		{
			System.out.println("remedial standard");
		}
		
	}
	
}





			
			
			
		
		
	