import java.util.*;
class str1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		int len=a.length;
		int i,count=0;
		for(i=0;i<len;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				count++;
			}
		}
		System.out.print(count);
	}
}	