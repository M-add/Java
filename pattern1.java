import java.util.*;
class pattern1
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0,c=1;
		int i,j,k;
		for(i=1;i<=(n*2)-1;i++)
		{
			if(i<=n-1)
			{
				for(j=1;j<=n-b;j++)
		      {
				System.out.printf("%d ",j);  
		      }
			  b++;
			}
		    else
		   {
			for(k=1;k<=c;k++)
		    {
				System.out.printf("%d ",k);
			}
			c++;
		   }
          System.out.printf("\n");	  
		}
	}
}