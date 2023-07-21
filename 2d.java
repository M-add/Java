import java.util.*;
class td
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int a[][]=new int[n1][n2];
		int b[][]=new int[n1][n2];
		int i,j;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]+b[i][j]);
				}
			}
		}
	}
}
