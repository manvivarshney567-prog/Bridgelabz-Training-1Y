import java.util.Scanner;
class perimeter
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght:-");
		int lenght=sc.nextInt();
		System.out.println("Enter Width:-");
		int Width=sc.nextInt();
		int perimeter =2*(lenght+Width);
		System.out.println("find Perimeter:-"+perimeter);
	}
}