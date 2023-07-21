import java.util.*;
class str3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=new String[str.split(" ").length];
		a=str.split(" ");
		int i,j,count=0,count1=0,temp;
		int small=0,large=0;
		for(i=0;i<a.length;i++)
		{
		   temp=a[i].length();
		   if(temp>count)
		   {
			 count=temp;
			 large=i;
		   }
		   if(count1==0||temp<count1)
		   {
			   count1=temp;
			   small=i;
		   }  
		}
		System.out.println("Smallest word:"+a[small]);
		System.out.println("Largest wordd:"+a[large]);
	}
}	