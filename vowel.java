import java.util.*;
class vowel
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int i,j,count;
		for(i=0;i<a.length;i++)
		{
		  char[] b=a[i].toCharArray();
		  count=0;
		  for(j=0;j<b.length;j++)
		  {
			  if(b[j]=='a'||b[j]=='e'||b[j]=='i'||b[j]=='o'||b[j]=='u')
			  {
				  count++;
			  }
		  }
		  System.out.println(count);
		}
		
	}
}
			 