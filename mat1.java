import java.util.*;
class mat1
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
			for(j=0;j<n;j++)
			{
				if(i%2==0&&j%2!=0)
				{
					System.out.printf("*  ");
				}
				else if(i%2!=0&&j%2==0)
				{
					System.out.printf("*  ");
				}
				else if(i%2==0&&j%2==0)
				{
					System.out.printf("%d ",a[i][j]+5);
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