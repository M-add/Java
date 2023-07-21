import java.util.*;
class repeate
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,count=0,k=0;
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]!=0)
				{
				 if(a[i]==a[j])
				 {
				  b[k]=a[i];
				  k++;
				  a[j]=0;
				  count++;
				 }
				}
			}
		}
		int count1=0;
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(b[i]==b[j])
				{
					b[j]=0;
					count1++;
				}
			}
		}
		System.out.printf("Total repeated element: %d\n",count-count1);
		for(i=0;i<k;i++)
		{
		  if(b[i]!=0)
		  {
			  System.out.printf("\nRepeated elements are:%d ",b[i]);
		  }
		}
		
	}
}