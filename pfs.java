import java.util.*;
class pfs
{
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i,j=1,k;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=j*j;
			j++;
		}
		int count=1;
		for(i=0;i<n;i++)
		{
		  for(k=0;k<n;k++)
		  {
			if(a[i]==b[k])
			{
              count++;
			}
		  }
		}
		System.out.printf("%d",count);
	}
}