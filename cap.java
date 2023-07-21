import java.util.*;
class cap
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int i,j,count;
		for(i=0;i<a.length;i++)
		{
		  String[] b=a[i].split("");
		  for(j=0;j<b.length;j++)
		  {
			  if(j==0)
			  {
				b[j]=b[j].toUpperCase();
			  }
			  else
			  {
				  b[j]=b[j].toLowerCase();
			  }
		  }
		  a[i]=String.join("",b);
		}
		str=String.join(" ",a);
		System.out.println(str);
		
	}
}