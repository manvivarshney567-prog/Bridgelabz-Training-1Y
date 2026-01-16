import java.util.Scanner;
class students
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pens");
		int pens=sc.nextInt();
		System.out.println("Enter students");
		int students=sc.nextInt();
		int studentget = pens/students;
		double remainingpens= pens%students;
		System.out.println("each students get :-"+studentget);
		System.out.println("Remaining pens :-"+remainingpens);

		
		
	}
	
}