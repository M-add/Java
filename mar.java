import java.util.*;
class mar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a number\n");
		int n=sc.nextInt();
		int a,p=1;
		while(n>0)
		{
			a=n%10;
			p=p*a;
			n=n/10;
		}
        System.out.println(+p);
	}
}	