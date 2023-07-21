import java.util.*;
class str
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		int len=a.length;
		int i,sum=0;
		for(i=0;i<len;i++)
		{
			if(a[i]>=48&&a[i]<=57)
			{
				sum=sum+(a[i]-48);
			}
		}
		System.out.print(sum);
	}
}