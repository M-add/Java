import java.util.*;
class str2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		int len=a.length;
		int i,count=0,count1=0,n=1;
		for(i=0;i<len;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				count++;
			}
		}
		System.out.print(count);
		System.out.print("\n");
		
		switch(n)
		{
			case 1:
			for(i=0;i<len;i++)
		   {
			 if(a[i]=='a')
			 {
				count1++;
			 }
		   }
		   System.out.print("Count of a "+count1);
		   case 2:
		     count1=0;
			for(i=0;i<len;i++)
		   { 
			 if(a[i]=='e')
			 {
				count1++;
			 }
		   }
		   System.out.print("\nCount of e "+count1);
		   case 3:
		   count1=0;
			for(i=0;i<len;i++)
		    {      
			  if(a[i]=='i')
			  {
				count1++;
			  }
		    }
		   System.out.print("\nCount of i "+count1);
		   case 4:
		   count1=0;
			for(i=0;i<len;i++)
		    { 
			  if(a[i]=='o')
			   {
				count1++;
			  }
		     }
		     System.out.print("\nCount of o "+count1);
            case 5:
			count1=0;
			for(i=0;i<len;i++)
		    { 
			  if(a[i]=='u')
			  {
				count1++;
			  }
		    }
		   System.out.print("\nCount of u "+count1);
		   break;
		   default:
		      System.out.print("over");
		}
	}
}	