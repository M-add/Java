import java.util.*;
public class prsq
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		   for(j=1;j<=n;j++)
		  {
			if(a[i]==j*j)
			{
				count++;
			}
		  }
		}
		System.out.printf("%d",count);
	}
}