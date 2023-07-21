import java.util.*;
class position
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+a[i];
				count++;
			}
		}
		System.out.print(sum);
	}
}