import java.util.Scanner;
class triangle
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in cm:-");
		double height=sc.nextDouble();
		System.out.println("Enter base in cm:-");
		double base=sc.nextDouble();
		double Area_cm=base*height*0.5;
		double Area_inch=Area_cm/(2.54*2.54);
		System.out.println("area of triangle in cm :-"+Area_cm);
		System.out.println("area of triangle in inche:-"+Area_inch);
	}
}