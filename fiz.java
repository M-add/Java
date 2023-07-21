import java.util.*;
class fiz
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%3==0)&&(n%5)==0)
		{
			System.out.print("FizzBuzz");
		}
		else if(n%3==0)
		{
			System.out.print("Fizz");
		}
		else if(n%5==0)
		{
			System.out.print("Buzz");
		}
		else
		{
			System.out.print(n);
		}
	}	
}
			