import java.util.*;
class pn
{
	pn()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,p=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				p=p+i;
			}
		}
		if(p==n)
		{
			System.out.print("Perfect number");
		}
		else
		{
			System.out.print("Not Perfect number");
		}
	}
	public static void main(String arg[])
	{
		pn obj=new pn();
	}
}