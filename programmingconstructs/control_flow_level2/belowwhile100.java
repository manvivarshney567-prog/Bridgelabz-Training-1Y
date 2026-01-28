import java.util.Scanner;
class belowwhile100
{
	
    public static void main(String args[] )
	{
		
        Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		
        int n=sc.nextInt();
        int count=n-1;
        if(n>0&&n<100)
		{
			
            while(count>=1)
			{
				
                if(n%count==0)
				{
					
                    System.out.println("the factors are"+count);
				}
			
                count--;
			}
		}
	}
}
