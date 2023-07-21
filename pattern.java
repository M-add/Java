import java.util.*;
class pattern
{
	public static void main(String[] arg)
	{
		int n=7;
		int i,j;
		for(i=1;i<=n;i++)
		{
		  for(j=1;j<=i;j++)
		  {
			  if(j%2==0)
			  {
				 System.out.printf("0"); 
			  }
			  else
			  {
				  System.out.printf("1");
			  }
		  }
		   System.out.printf("\n");
		}
		
	}
}