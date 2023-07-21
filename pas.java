import java.util.*;
class pas 
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();;	
		int i,k,j;
		for(i=1;i<=n;i++)
		{
			for(k=i;k<=n;k++)
			{
				System.out.printf("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d ",j);
			}
			for(j=i-1;j>0;j--)
			{
				System.out.printf("%d ",j);
			}
			System.out.printf("\n");
		}
	}
}
					