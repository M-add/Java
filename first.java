import java.util.*;
class first
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
        int i;
		int j=0,count=0,k=0,m;
		int[] a=new int[n];
		int[] b=new int[k+n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=s;i<n;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(i=0;i<s;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(i=0;i<n;i++)
		{
			a[i]=b[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		int target=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==target)
			{
			  System.out.printf("%d ",i);
			  count++;
			}		
		}
		if((count==0))
		{
		  System.out.print("-1");
		}
		
	}
}
			
			
			