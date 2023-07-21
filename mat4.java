import java.util.*;
class mat4
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
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
			for(j=0;j<n-1;j++)
			{
				a[i][j]=a[i][j]*a[i][n-1];
				a[i][n-1]=a[i][n-1]*a[i][1];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==1)
				{
					System.out.printf("*  ");
				}
				else
				{
					System.out.printf("%d ",a[i][j]);
				}	
			}
			System.out.printf("\n");
		}
		
	}
}