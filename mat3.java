import java.util.*;
class mat3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			  if(i+1<n&&j+1<n&&j+2<n)
			  {
			  temp=a[i][j];
			  a[i][j]=a[i][j+1]+a[i][j+2];
			  a[i][j+1]=a[i][j+1]-temp;
			  }
			  else
			  {
			    temp=a[i][j];
			    a[i][j]=a[i][j+1]+a[i][j+2];
                a[i][j+1]=a[i][j+1]-temp;
			  }
				  
			  break;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.printf("%d  ",a[i][j]);
			}
			System.out.printf("\n");
		}
		
	}
}