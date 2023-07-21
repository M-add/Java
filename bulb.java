import java.util.*;
class bulb
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
				count++;
				for(j=i;j<n;j++)
				{
					if(a[j]==0)
					{
						a[j]=1;
					}
					else if(a[j]==1)
					{
						a[j]=0;
					}
				}
			}
		}
		System.out.println(count);
	}
}