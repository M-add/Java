import java.util.*;
class fish
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int i,j,count=0;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			a[i]=a[i]-1;
			if(a[i]==0)
			{
				a[i]=6;	
				count++;
			}
			if(i==(n-1))
			{
				n=n+count;
				count=0;
			}
		}
	}
}