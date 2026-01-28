import java.util.Scanner;
class factor
{
	
    public static void main(String args[])
	{
		
        Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
        if(n>0)
		{
			
            for(int i=1;i<n;i++)
			{
				
                if(n%i==0)
				{
					
                    System.out.println("the factors of the number are"+i);
				}
			}
		}
	}
}

