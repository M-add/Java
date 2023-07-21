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
		for (i = 0; i <n1; i++) 
		{
         for (j = 0; j <n2; j++) 
	     {
          a[i][j]=sc.nextInt();
		 }
		}
		for (i = 0; i <n1; i++) 
		{
         for (j = 0; j <n2; j++) 
	     {
          b[i][j]=sc.nextInt();
		 }
		}
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(i==j)
				{
					System.out.printf("%d ",a[i][j]+b[i][j]);
				}
				else if((i+j==n1-1))
				{
					System.out.printf("%d ",a[i][j]+b[i][j]);
				}
				else
				{
					System.out.printf("%d ",a[i][j]);ṇ
				}			
			}
			System.out.println("\n");
		}
	}
}
