import java.util.*;
class dia
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,a,sum=0,j=0,c;
		int b=n;
		while(b!=0)
		{
			c=b%10;
			j++;
			b=b/10;
		}
		b=n;
		while(n>0)
		{
			a=n%10;
			sum=sum+(int)Math.pow(a,j);
			j--;
			n=n/10;
		}	
		if(sum==b)
		{
			System.out.print("It is disarium number");
		}
		else
		{
			System.out.print("It is not disarium number");
		}
	}
}
