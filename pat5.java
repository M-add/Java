import java.util.*;
public class pat5
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[][]=new int[n][n];
        int i,j;
		for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
          {
              a[i][j]=sc.nextInt();
          }
		}
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]+=5;
				}
			}
			else
			{
				for(j=0;j<n;j=j+2)
				{
					a[i][j]+=5;
				}
			}
		}
		for(i=0;i<n;i++)
        {
			if(i%2==0)
            {
			  for(j=0;j<n;j++)
			  {
				 if(j%2==0)
				 {
					System.out.printf("%d ",a[i][j]);
				 }
				 else if(j!=n-1)
				 {
				  if(a[i][j-1]<=9)
				  {
					 System.out.printf("s ");
				  }
				  else
				  {
					 System.out.printf("d ");
				  }	
				 }
				 else if(j==(n-1) &&i<n)
				 {
					if(a[i+1][j-1]<=9)
				  {
					 System.out.printf("s ");
				  }
				  else
				  {
					 System.out.printf("d ");
				  }	
				 }				  
				 
			  }
			}
			 else
			 {
				 for(j=0;j<n;j++)
				 {
				   if(j%2!=0)
				   {
					   System.out.printf("%d ",a[i][j]);
				   }
				   else if(j!=n-1&&i<n) 
					 if(a[i+1][j]<=9)
				     {
					  System.out.printf("s ");
				     }
				     else
				     {
					  System.out.printf("d ");
				     }
					 else if(j==n-1&&i<n)
					 {
					   if(a[i-1][j]<=9)
				      {
					   System.out.printf("s ");
				      }
				      else
				      {
					   System.out.printf("d ");
				      }
					 }
				 }
			 }
			 System.out.printf("\n");
					 
		 }
	}		 
}