import java.util.*;
class fib
{
	public static void main(String args[])
	{
		int n1=1,n2=1,n3=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a number\n");
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(+n3);
	}
}
			