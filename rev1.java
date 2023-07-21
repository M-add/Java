import java.util.*;
class rev1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int i,j;
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}