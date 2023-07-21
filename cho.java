import java.util.*;
class cho
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int i,j,sum=0,sum1=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<c;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=b[0])
			{
				sum=sum+a[i];
			}
		}
			for(i=0;i<n;i++)
			{
				if(a[i]!=b[1])
			  {
				sum1=sum1+a[i];
			   }	
			}
		  if(sum1<sum)
			{
					System.out.printf("%d",sum1);
			}
			else
			{
					System.out.printf("%d",sum);
			}
	
	}
}
		