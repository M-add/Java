import java.util.*;
class per
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(t>0)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			int max=a[0];
			for(i=l;i<=r;i++)
			{
				a[i]=0;
			}
			for(i=0;i<n;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}
			System.out.printf("%d",max);
			t--;
		}
	}
}