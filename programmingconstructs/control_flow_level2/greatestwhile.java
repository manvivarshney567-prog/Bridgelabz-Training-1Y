import java.util.Scanner;
class greatestwhile
{
	
    public static void main(String args[])
	{
		
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
        int greatestfactor=1;
        int i=a-1;
        while(i>=1)
		{
			
            if(a%i==0)
			{
				
                greatestfactor=i;
                break;
            }
            i--;
        }
        System.out.println("greatest factor"+greatestfactor);
    }
}


