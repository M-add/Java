import java.util.*;
class mat2
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
				if(i==1&&j==1)
				{
					System.out.printf("%d  ",a[i][j]);
				}
				else
				{
					System.out.printf("*  ");
				}
					
			}
			System.out.printf("\n");
		}
		
	}
}