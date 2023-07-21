import java.util.*;
class fill
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		String[] ch=str.split(" ");
		int i,j,count;
		String temp=ch[1];
		for(i=0;i<ch.length;i++)
		{
			if(i==1)
			{
				ch[i]="______";
			}
			System.out.printf("%s ",ch[i]);
		}
		System.out.println("Options");
		System.out.println("Options a:"+temp);
		System.out.println("Options b:"+b);
		System.out.println("Options c:"+c);
		System.out.println("Enter any Option:");
		String s=sc.nextLine();
		char n=s.charAt(0);
		switch(n)
		{
		  case 'a':
		      ch[1]=temp;
     		  for(i=0;i<ch.length;i++)
		     {
			   System.out.printf("%s ",ch[i]);
		     } 
			 break;
			 case 'b':
		      ch[1]=b;
     		  for(i=0;i<ch.length;i++)
		     {
			   System.out.printf("%s ",ch[i]);
		     } 
			 break;
			 case 'c':
		      ch[1]=c;
     		  for(i=0;i<ch.length;i++)
		     {
			   System.out.printf("%s ",ch[i]);
		     } 
			 break;
		}
		System.out.printf("\n");
		if(n=='a')
		{
			System.out.println("*****100/100*****");
		}
		else if(n=='b')
		{
			System.out.println("*****0/100*****");
		}
		else if(n=='c')
		{
			System.out.println("*****50/100*****");
		}
		
	}
}