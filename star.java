import java.util.*;
class star
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();;	
		int i,k,j,c=n-1;
		for(i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
			 for(k=i;k<=n;k++)
			 {
			 	System.out.printf(" ");
			 }
			 for(j=1;j<=i;j++)
			 {
				  System.out.printf("* ");
			 }
			}
			else
			{
				for(k=1;k<=i-(n-1);k++)
			    {
			 	 System.out.printf(" ");
			    }
				for(j=1;j<=c;j++)
				{
					System.out.printf("* ");
				}
				c--;
			}		
			System.out.print("\n");
		}
	}
}