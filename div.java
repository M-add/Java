import java.util.*;
class div
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a number\n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int s=n%i;
			if(s==0)
			{
				int a=i;
				System.out.printf("%d ",a);
	     	}
		}
	}
}
