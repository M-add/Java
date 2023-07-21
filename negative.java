import java.util.*;
class negative
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int i,j=0,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
				count++;
			}
		}
		System.out.print(count);
		System.out.print("\n");
		for(i=0;i<count;i++)
		{
			 System.out.print(b[i]);
		}
		 
	}
}