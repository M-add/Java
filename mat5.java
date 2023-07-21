import java.util.*;
class mat5
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int m;
		int i,j,x=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			m=n;
			for(j=0;j<n;j++)
			{
				if(i%2==0)
				{
				  System.out.print(a[j][i]+" ");
				}
				else
				{
					System.out.print(a[m-1][i]+" ");
					m--;
				}
			}
		}
	}
}