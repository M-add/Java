import java.util.*;
class big
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter 3 number\n");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2&&n1>n3)
		{
			System.out.println("the greatest number is:"+n1);
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println("the greatest number is:"+n2);
		}
		else if(n3>n1&&n3>n2)
		{
			System.out.println("the greatest number is:"+n3);
		}
	}
}
		
		