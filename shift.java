import java.util.*;
class shift
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
        int i;
		int j=0,count=0,k=0;
		int[] a=new int[n];
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
			
		}
		for(i=s;i<n;i++)
		{
			a[j]=a[i];
			j++;
			count++;
		}
		for(i=count;i<n;i++)
		{
		   a[i]=b[k];
		   k++;
		}
        for(i=0;i<n;i++)
		{
		  System.out.printf("%d ",a[i]);
		}		
	}
}